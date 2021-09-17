package com.collection;

public class LongestEvenWord {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("I was"));
    }



    public static String findMaxLenEven(String str)
    {
        int n = str.length();
        int i = 0;
        int currlen = 0;
        int maxlen = 0;
        int st = -1;

        while (i < n)
        {
            if (str.charAt(i) == ' ')
            {
                if (currlen % 2 == 0)
                {
                    if (maxlen < currlen)
                    {
                        maxlen = currlen;
                        st = i - currlen;
                    }
                }

                currlen = 0;
            }
            else
            {
                currlen++;
            }

            i++;
        }

        if (currlen % 2 == 0)
        {
            if (maxlen < currlen)
            {
                maxlen = currlen;
                st = i - currlen;
            }
        }

        if (st == -1)
            return "-1";

        return str.substring(st, st + maxlen);
    }


}
