package edu.IFNTUNG.bpbOnline.utils;

import java.util.Random;

public class StringUtils {
    private static final String ALFANUMERICAL_ALL_CAPS = "012323RFDSD45678923ABCDEFGAXCSHIJKLMFSCDNOPQRSTUVWXYZ";
    private static Random random = new Random();

    public static String getRandomString(int stringLength)
    {
        StringBuilder stringBuilder = new StringBuilder(stringLength);
        for (int i = 0; i < stringLength; i++)
        {
            stringBuilder.append(ALFANUMERICAL_ALL_CAPS.charAt(random.nextInt(ALFANUMERICAL_ALL_CAPS.length())));
        }
        return stringBuilder.toString();
    }

    public static String generateRandomEmail(int fixLength){
        return getRandomString(fixLength).concat("@gmail.com");
    }
}
