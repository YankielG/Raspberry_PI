package pl.edu.wszib.jwd.java_dev.dodatki;

import javax.swing.text.html.StyleSheet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ZamianaKoloru {
    public static List<String> zamianaKoloru(Collection<String> strColors) {
       StyleSheet styleSheet = new StyleSheet();
       List<String> colors = new ArrayList<>();

       for (String strColor : strColors) {
           Color color = styleSheet.stringToColor(strColor);
           colors.add("rgba(" +
                   color.getRed() + "," +
                   color.getGreen() + "," +
                   color.getBlue() + ",1)");
       }
       return colors;
    }
}
