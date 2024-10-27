package net.netease.font;

import lol.tgformat.Client;
import net.netease.utils.RapeMasterFontManager;
import tech.skidonion.obfuscator.annotations.Renamer;
import tech.skidonion.obfuscator.annotations.StringEncryption;

import java.awt.*;
import java.io.InputStream;

/**
 * @author TG_format
 * @since 2024/6/1 15:40
 */
@Renamer
@StringEncryption
public class FontManager {
    public static RapeMasterFontManager arial10;
    public static RapeMasterFontManager arial12;
    public static RapeMasterFontManager arial14;
    public static RapeMasterFontManager arial16;
    public static RapeMasterFontManager arial18;
    public static RapeMasterFontManager arial20;
    public static RapeMasterFontManager arial22;
    public static RapeMasterFontManager arial24;
    public static RapeMasterFontManager arial26;
    public static RapeMasterFontManager thin40;
    public static RapeMasterFontManager thin16;
    public static RapeMasterFontManager arial64;
    public static RapeMasterFontManager arial28;
    public static RapeMasterFontManager arial32;
    public static RapeMasterFontManager arial40;
    public static RapeMasterFontManager arial42;
    public static RapeMasterFontManager splash40;
    public static RapeMasterFontManager splash18;
    public static RapeMasterFontManager icon22;
    public static RapeMasterFontManager Tahoma12;
    public static RapeMasterFontManager Tahoma14;
    public static RapeMasterFontManager Tahoma16;
    public static RapeMasterFontManager Tahoma18;
    public static RapeMasterFontManager Tahoma20;
    public static RapeMasterFontManager Tahoma22;
    public static RapeMasterFontManager Tahoma24;
    public static RapeMasterFontManager Tahoma26;
    public static RapeMasterFontManager Tahoma28;
    public static RapeMasterFontManager Tahoma32;
    public static RapeMasterFontManager Tahoma40;
    public static RapeMasterFontManager Tahoma42;
    public static RapeMasterFontManager icontestFont35;
    public static RapeMasterFontManager icontestFont90;
    public static RapeMasterFontManager icontestFont80;
    public static RapeMasterFontManager icontestFont20;
    public static RapeMasterFontManager icontestFont40;
    public static RapeMasterFontManager lettuceFont20;
    public static RapeMasterFontManager lettuceFont24;
    public static RapeMasterFontManager lettuceBoldFont26;
    public static RapeMasterFontManager infoFontBold;
    public static RapeMasterFontManager titleFontBold;
    public static RapeMasterFontManager bold22;
    public static RapeMasterFontManager infoFont;
    public static RapeMasterFontManager titleFont;
    public static RapeMasterFontManager edit10;
    public static RapeMasterFontManager edit12;
    public static RapeMasterFontManager edit13;
    public static RapeMasterFontManager edit16;
    public static RapeMasterFontManager edit18;
    public static RapeMasterFontManager edit20;
    public static RapeMasterFontManager edit22;
    public static RapeMasterFontManager edit26;
    public static RapeMasterFontManager posterama12;
    public static RapeMasterFontManager posterama16;
    public static RapeMasterFontManager posterama18;
    public static RapeMasterFontManager posterama20;
    public static RapeMasterFontManager posterama26;
    public static RapeMasterFontManager notifications;
    public static RapeMasterFontManager stylesicons;
    public static RapeMasterFontManager opensans18;
    public static RapeMasterFontManager opensans20;
    public static RapeMasterFontManager opensans22;
    public static RapeMasterFontManager Exhi_icon40;
    public static RapeMasterFontManager rubik17;
    public static RapeMasterFontManager rubik15;
    public static RapeMasterFontManager rubik18;
    public static RapeMasterFontManager tenacityBold20;
    public static RapeMasterFontManager tenacityBold16;
    private static String fontFile;
    private static String editFontFile;
    private static String sfthinFile;
    private static String boldFile;
    private static String tahoma1File;
    private static String icontFile;
    private static String iconfontFile;
    private static String geologicaFile;
    private static String geologicaboldFile;
    private static String posteramaFile;
    private static String notificationsFile;
    private static String stylesiconsFile;
    private static String opensansFile;
    private static String ExhiiconFile;
    private static String rubikFile;
    private static String tenacityBoldfile;

    public static void downloadFont() {
        fontFile =  "font.ttf";
        editFontFile =  "edit.ttf";
        sfthinFile =  "sfthin.ttf";
        boldFile =  "bold.ttf";
        tahoma1File =  "tahoma1.ttf";
        icontFile =  "icont.ttf";
        iconfontFile =  "iconfont.ttf";
        geologicaFile =  "geologica.ttf";
        geologicaboldFile =  "geologica-bold.ttf";
        posteramaFile =  "fz.ttf";
        notificationsFile =  "notifications.ttf";
        stylesiconsFile =  "stylesicons.ttf";
        opensansFile =  "opensans.ttf";
        ExhiiconFile = "Exhi_icon.ttf";
        rubikFile =  "rubik.ttf";
        tenacityBoldfile = "tenacity-bold.ttf";

    }

    public static void init() {

        edit10 = new RapeMasterFontManager(getFont(editFontFile, 10.0F));
        edit12 = new RapeMasterFontManager(getFont(editFontFile, 12.0F));
        edit13 = new RapeMasterFontManager(getFont(editFontFile, 13.0F));
        edit16 = new RapeMasterFontManager(getFont(editFontFile, 16.0F));
        edit18 = new RapeMasterFontManager(getFont(editFontFile, 18.0F));
        edit20 = new RapeMasterFontManager(getFont(editFontFile, 20.0F));
        edit22 = new RapeMasterFontManager(getFont(editFontFile, 22.0F));
        edit26 = new RapeMasterFontManager(getFont(editFontFile, 26.0F));

        thin40 = new RapeMasterFontManager(getFont(sfthinFile, 40.0F));
        thin16 = new RapeMasterFontManager(getFont(sfthinFile, 16.0F));
        arial10 = new RapeMasterFontManager(getFont(fontFile, 10.0F));
        arial12 = new RapeMasterFontManager(getFont(fontFile, 12.0F));
        arial14 = new RapeMasterFontManager(getFont(fontFile, 14.0F));
        arial16 = new RapeMasterFontManager(getFont(fontFile, 16.0F));
        arial18 = new RapeMasterFontManager(getFont(fontFile, 18.0F));
        arial20 = new RapeMasterFontManager(getFont(fontFile, 20.0F));
        arial22 = new RapeMasterFontManager(getFont(fontFile, 22.0F));
        arial24 = new RapeMasterFontManager(getFont(fontFile, 24.0F));
        arial26 = new RapeMasterFontManager(getFont(fontFile, 26.0F));
        arial28 = new RapeMasterFontManager(getFont(fontFile, 28.0F));
        arial32 = new RapeMasterFontManager(getFont(fontFile, 32.0F));
        arial40 = new RapeMasterFontManager(getFont(fontFile, 40.0F));
        arial42 = new RapeMasterFontManager(getFont(fontFile, 42.0F));
        splash40 = new RapeMasterFontManager(getFont(fontFile, 40.0F));
        splash18 = new RapeMasterFontManager(getFont(fontFile, 18.0F));
        arial64 = new RapeMasterFontManager(getFont(fontFile, 64.0F));
        Tahoma12 = new RapeMasterFontManager(getFont(fontFile, 12.0F));
        Tahoma14 = new RapeMasterFontManager(getFont(fontFile, 14.0F));
        Tahoma16 = new RapeMasterFontManager(getFont(fontFile, 16.0F));
        Tahoma18 = new RapeMasterFontManager(getFont(fontFile, 18.0F));
        Tahoma20 = new RapeMasterFontManager(getFont(fontFile, 20.0F));
        Tahoma22 = new RapeMasterFontManager(getFont(fontFile, 22.0F));
        Tahoma24 = new RapeMasterFontManager(getFont(fontFile, 24.0F));
        Tahoma26 = new RapeMasterFontManager(getFont(fontFile, 26.0F));
        Tahoma28 = new RapeMasterFontManager(getFont(fontFile, 28.0F));
        Tahoma32 = new RapeMasterFontManager(getFont(fontFile, 32.0F));
        Tahoma40 = new RapeMasterFontManager(getFont(fontFile, 40.0F));
        Tahoma42 = new RapeMasterFontManager(getFont(fontFile, 42.0F));
        bold22 = new RapeMasterFontManager(getFont(boldFile, 18.0F));
        titleFontBold = new RapeMasterFontManager(getFont(tahoma1File, 18.0F));
        infoFontBold = new RapeMasterFontManager(getFont(tahoma1File, 15.0F));
        titleFont = new RapeMasterFontManager(getFont(tahoma1File, 19.0F));
        infoFont = new RapeMasterFontManager(getFont(tahoma1File, 12.0F));
        icontestFont90 = new RapeMasterFontManager(getFont(icontFile, 90.0F));
        icontestFont80 = new RapeMasterFontManager(getFont(icontFile, 80.0F));
        icontestFont35 = new RapeMasterFontManager(getFont(icontFile, 35.0F));
        icon22 = new RapeMasterFontManager(getFont(iconfontFile, 22.0F));
        icontestFont20 = new RapeMasterFontManager(getFont(icontFile, 20.0F));
        icontestFont40 = new RapeMasterFontManager(getFont(icontFile, 40.0F));
        lettuceFont20 = new RapeMasterFontManager(getFont(geologicaFile, 20.0F));
        lettuceFont24 = new RapeMasterFontManager(getFont(geologicaFile, 24.0F));
        lettuceBoldFont26 = new RapeMasterFontManager(getFont(geologicaboldFile, 26.0F));

        posterama12 = new RapeMasterFontManager(getFont(posteramaFile, 12.0F));
        posterama16 = new RapeMasterFontManager(getFont(posteramaFile, 16.0F));
        posterama18 = new RapeMasterFontManager(getFont(posteramaFile, 18.0F));
        posterama20 = new RapeMasterFontManager(getFont(posteramaFile, 20.0F));
        posterama26 = new RapeMasterFontManager(getFont(posteramaFile, 26.0F));


        notifications = new RapeMasterFontManager(getFont(notificationsFile, 18.0F));
        stylesicons = new RapeMasterFontManager(getFont(stylesiconsFile, 50.0F));


        opensans18 = new RapeMasterFontManager(getFont(opensansFile, 18.0F));
        opensans20 = new RapeMasterFontManager(getFont(opensansFile, 20.0F));
        opensans22 = new RapeMasterFontManager(getFont(opensansFile, 22.0F));

        Exhi_icon40 = new RapeMasterFontManager(getFont(ExhiiconFile,40.0F));
        rubik17 = new RapeMasterFontManager(getFont(rubikFile, 17.0F));
        rubik15 = new RapeMasterFontManager(getFont(rubikFile, 15.0F));
        rubik18 = new RapeMasterFontManager(getFont(rubikFile,18.0F));
        tenacityBold20=new RapeMasterFontManager(getFont(tenacityBoldfile,20.0F));
        tenacityBold16= new RapeMasterFontManager(getFont(tenacityBoldfile,16.0F));

    }

    private static Font getFont(String fontName, float fontSize) {
        Font font = null;
        try {
            InputStream inputStream = Client.class.getResourceAsStream("/assets/minecraft/bloodline/fonts/" + fontName);
            assert (inputStream != null);
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(fontSize);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return font;
    }
}