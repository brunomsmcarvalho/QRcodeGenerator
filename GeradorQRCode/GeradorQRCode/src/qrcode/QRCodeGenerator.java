package qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class QRCodeGenerator {

    public static BufferedImage gerar(String texto, int tamanho) throws Exception {

        QRCodeWriter writer = new QRCodeWriter();
        BitMatrix matrix = writer.encode(
                texto,
                BarcodeFormat.QR_CODE,
                tamanho,
                tamanho
        );

        BufferedImage image = new BufferedImage(
                tamanho,
                tamanho,
                BufferedImage.TYPE_INT_RGB
        );

        for (int x = 0; x < tamanho; x++) {
            for (int y = 0; y < tamanho; y++) {
                image.setRGB(
                        x,
                        y,
                        matrix.get(x, y)
                            ? Color.BLACK.getRGB()
                            : Color.WHITE.getRGB()
                );
            }
        }
        return image; // QR Code em buffer
    }
}

