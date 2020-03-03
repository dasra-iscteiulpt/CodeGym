package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.BmpReader;
import com.codegym.task.task16.task1631.common.ImageReader;
import com.codegym.task.task16.task1631.common.ImageTypes;
import com.codegym.task.task16.task1631.common.JpgReader;
import com.codegym.task.task16.task1631.common.PngReader;
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes) {

        if (imageTypes==null) {
            throw new IllegalArgumentException();
        }
        if (imageTypes.equals(ImageTypes.BMP))
            return new BmpReader();
        else if (imageTypes.equals(ImageTypes.JPG))
            return new JpgReader();
        else if (imageTypes.equals(ImageTypes.PNG))
            return new PngReader();
        else{
            throw new IllegalArgumentException();
        }

    }
}

