package net.minecraft.network.play.client;

import java.io.IOException;

import lombok.Getter;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;

@Getter
public class C09PacketHeldItemChange implements Packet<INetHandlerPlayServer>
{
    private int slotId;

    public C09PacketHeldItemChange()
    {
    }

    public C09PacketHeldItemChange(int slotId)
    {
        this.slotId = slotId;
    }

    /**
     * Reads the raw packet data from the data stream.
     */
    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.slotId = buf.readShort();
    }

    /**
     * Writes the raw packet data to the data stream.
     */
    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeShort(this.slotId);
    }

    /**
     * Passes this Packet on to the NetHandler for processing.
     */
    public void processPacket(INetHandlerPlayServer handler)
    {
        handler.processHeldItemChange(this);
    }

}
