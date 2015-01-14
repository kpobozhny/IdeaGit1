package com.kok.pack1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by kostya on 1/14/15.
 */
public class net1 {
    /// changes

    public static void main(String[] args)  {

        try {
            int r = 5;
            InetAddress Address = InetAddress.getLocalHost();
            System.out.println(Address);

            Address = InetAddress.getByName("www.google.com");
            System.out.println(Address);

            InetAddress[] SW = InetAddress.getAllByName("www.luxoft.com");
            for (int i=0; i<SW.length;i++)
                System.out.println(SW[i]);


        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
