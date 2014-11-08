class CountChar2{

    public static void main(String args[])
    {
        String dummy = args[0];
        System.out.println(dummy);
        String res = compressAlt(dummy);

        System.out.println(res);
    }
    static String compressAlt(String a)
    {
        int size = 0;
        size = calc_size(a);


        if (size >= a.length())
        {

            System.out.println("Compression not useful!");
            return a;
        }
        System.out.println(size);
        int count = 1;
        char[] val = new char[size];
        int index = 0;

        char lastchar = a.charAt(0);
        for (int i = 1; i < a.length(); i++)
        {
            if (a.charAt(i) == lastchar)
                count++;
            else
            {
                val[index++] = lastchar;
                char[] charcnt = String.valueOf(count).toCharArray();
                for (int j = 0;j < String.valueOf(charcnt).length();j++)
                {
                    val[index++] = charcnt[j];
                }
                lastchar = a.charAt(i);
                count = 1;
            }
        }
        val[index++] = lastchar;
        char[] charcnt = String.valueOf(count).toCharArray();
        for (int j = 0;j < String.valueOf(charcnt).length();j++)
        {
            val[index] = charcnt[j];
        }
        return String.valueOf(val);
    }

    static int calc_size(String b)
    {
        int count = 0;
        int size = 0;
        char lastchar = b.charAt(0);
        for (int i = 1; i < b.length(); i++)
        {
            if (b.charAt(i) == lastchar)
            {
                count++;
            }
            else
            {
                size += String.valueOf(count).length() + 1;
                lastchar = b.charAt(i);
                count = 1;
            }
        }
        size += String.valueOf(count).length() + 1;
        return size;
    }
}
