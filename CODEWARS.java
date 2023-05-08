import java.util.Arrays;
public class CODEWARS {
    public static void main(String[] args) {
        String hex = "#111111";
        int[] res = new int[3];
        res = hexStringToRGB(hex);
        System.out.println(Arrays.toString(res));//[17, 17, 17]
        hex = "#000000";
        res = hexStringToRGB(hex);
        System.out.println(Arrays.toString(res));//[0, 0, 0]
        hex = "#FF9933";
        res = hexStringToRGB(hex);
        System.out.println(Arrays.toString(res));//[255, 153, 51]
        hex = "#beaded";
        res = hexStringToRGB(hex);
        System.out.println(Arrays.toString(res));//[190, 173, 237]
        hex = "#Fa3456";
        res = hexStringToRGB(hex);
        System.out.println(Arrays.toString(res));//[250, 52, 86]
    }
    public static int[] hexStringToRGB(String hex) {
        int[] res = new int[3];
        hex = hex.substring(1);
        for (int i = 0; i<3; i++) {
            res[i] = Integer.parseInt(hex.substring(i*2, i*2+2), 16);
        }
        return res;
    }
}