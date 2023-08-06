package com.example.cluster_project.gettingData;

import android.graphics.Bitmap;

import java.util.concurrent.CopyOnWriteArrayList;

public class DivideImages {

     public CopyOnWriteArrayList<Bitmap> getDivideImages(Bitmap b) {
         CopyOnWriteArrayList<Bitmap> bs = new CopyOnWriteArrayList<Bitmap>();
// TODO Auto-generated method stub
        final int width = b.getWidth();
        final int height = b.getHeight();

        final int pixelByCol = width / 2;
        final int pixelByRow = height / 2;
//List<Bitmap> bs = new ArrayList<Bitmap>();
        for (int i = 0; i < 2; i++) {
            System.out.println("row no. " + i);
            for (int j = 0; j < 2; j++) {

                System.out.println("Column no." + j);
                int startx = pixelByCol * j;
                int starty = pixelByRow * i;
                Bitmap b1 = Bitmap.createBitmap(b, startx, starty, pixelByCol, pixelByRow);
                bs.add(b1);

            }
        }
        return bs;
    }
}
