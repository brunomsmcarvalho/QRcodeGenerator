package app;

import dao.ProdutoDAO;
import qrcode.QRCodeGenerator;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        try {
            String dados = ProdutoDAO.buscarDadosParaQRCode(1);

            if (dados == null) {
                System.out.println("Registro não encontrado");
                return;
            }

            BufferedImage qr = QRCodeGenerator.gerar(dados, 300);

            ImageIO.write(qr, "PNG", new File("produto_1.png"));

            System.out.println("QR Code criado com dados do banco!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
