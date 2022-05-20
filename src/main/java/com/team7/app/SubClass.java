package com.team7.app;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.team7.app.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SubClass {
    int hargaHp1, hargaHp2, hargaHp3, hargaHp4,
            hargaHp5, beliHpType1, beliHpType2, beliHpType3, beliHpType4, beliHpType5;
    int totalHp1, totalHp2, totalHp3, totalHp4, totalHp5;
    int totalSm1, totalSm2, totalSm3, totalSm4, totalSm5;
    int totalTws1, totalTws2, totalTws3, totalTws4, totalTws5;
    int hargaTws1, hargaTws2, hargaTws3, hargaTws4, hargaTws5, beliTwsType1, beliTwsType2, beliTwsType3, beliTwsType4, beliTwsType5;
    int hargaMac1, hargaMac2, hargaMac3, hargaMac4, hargaMac5, beliMacType1, beliMacType2, beliMacType3, beliMacType4, beliMacType5;
    boolean hp1, hp2, hp3, hp4, hp5, tws1, tws2, tws3, tws4, tws5, sm1, sm2, sm3, sm4, sm5;
    int pembayaran, kembalian;
    String nama1, nama2, nama3, nama4, nama5;
    String namaTws1, namaTws2, namaTws3, namaTws4, namaTws5;
    String namaMacbook1, namaMacbook2, namaMacbook3, namaMacbook4, namaMacbook5;
    String[] namaHp = {"Iphone X", "Iphone XR", "Iphone 13", "Iphone 11", "Iphone 11 Pro Max"};
    String[] namaTws = {"Airpods 1", "Airpods 2", "Airpods Max", "Airpods Pro", "Airpods Pro Max"};
    String[] namaMac = {"Macbook Pro 2020 256 Gb", "Macbook Air Pro 2020", "Macbook Pro M1", "Macbook Air Pro 2020 512Gb", "Macbook Pro M1 2020 512Gb"};
    Scanner input = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Product> productList = new ArrayList<>();

    String namaPegawai, namaPembeli, alamatToko, alamatPembeli, noHpToko, noHpPembeli, email;


    void transaksi() throws IOException {
        System.out.println("Hallo Selamat datang pegawai, masukkan nama anda");
        namaPegawai = br.readLine();


        for (String ulang = "Y"; ulang.equalsIgnoreCase("y"); ) {
            System.out.println("1. Handphone");
            System.out.println("2. TWS");
            System.out.println("3. Macbook");
            System.out.println("masukkan pilihan anda");
            int a = Integer.parseInt(br.readLine());
            switch (a) {
                case 1:
                    System.out.println("anda memilih handphone");
                    for (int i = 0; i < namaHp.length; i++) {
                        System.out.println(i + 1 + ". " + namaHp[i]);
                    }

                    System.out.println("Masukkan ingin handphone apa? ");
                    int b = Integer.parseInt(br.readLine());
                    switch (b) {
                        case 1:
                            hargaHp1 = 60000;
                            nama1 = "Iphone X";
                            hp1 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliHpType1 = input.nextInt();
                            break;
                        case 2:
                            nama2 = "Iphone XR";
                            hargaHp2 = 8000;
                            hp2 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliHpType2 = input.nextInt();
                            break;
                        case 3:
                            nama3 = "Iphone 13";
                            hargaHp3 = 23000;
                            hp3 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliHpType3 = input.nextInt();
                            break;
                        case 4:
                            nama4 = "Iphone 11";
                            hargaHp4 = 11000;
                            hp4 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliHpType4 = input.nextInt();
                            break;
                        case 5:
                            nama5 = "Iphone 11 Pro Max";
                            hargaHp5 = 15000;
                            hp5 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliHpType5 = input.nextInt();
                            break;

                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                    break;
                case 2:
                    System.out.println("anda memilih TWS");
                    for (int i = 0; i < namaTws.length; i++) {
                        System.out.println(i + 1 + ". " + namaTws[i]);
                    }

                    System.out.println("Masukkan ingin Tws apa? ");
                    b = Integer.parseInt(br.readLine());
                    switch (b) {
                        case 1:
                            hargaTws1 = 100000;
                            namaTws1 = "Airpods 1";
                            tws1 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliTwsType1 = input.nextInt();
                            break;
                        case 2:
                            hargaTws2 = 200000;
                            namaTws2 = "Airpods 2";
                            tws2 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliTwsType2 = input.nextInt();
                            break;
                        case 3:
                            hargaTws3 = 200000;
                            namaTws2 = "Airpods Max";
                            tws3 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliTwsType3 = input.nextInt();
                            break;
                        case 4:
                            hargaTws4 = 200000;
                            namaTws2 = "Airpods Pro";
                            tws4 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliTwsType4 = input.nextInt();
                            break;
                        case 5:
                            hargaTws5 = 200000;
                            namaTws2 = "Airpods Pro Max";
                            tws5 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliTwsType5 = input.nextInt();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                    break;

                case 3:
                    System.out.println("anda memilih macbook");
                    for (int i = 0; i < namaMac.length; i++) {
                        System.out.println(i + 1 + ". " + namaMac[i]);
                    }
                    System.out.println("Masukkan ingin macbook apa? ");
                    b = Integer.parseInt(br.readLine());
                    switch (b) {
                        case 1:
                            hargaMac1 = 100000;
                            namaMacbook1 = "Macbook Pro 2020";
                            sm1 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliMacType1 = input.nextInt();
                            break;
                        case 2:
                            hargaMac2 = 200000;
                            namaMacbook2 = "Macbook Air Pro 2020";
                            sm2 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliMacType2 = input.nextInt();
                            break;
                        case 3:
                            hargaMac3 = 200000;
                            namaMacbook3 = "Macbook Pro M1";
                            sm3 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliMacType3 = input.nextInt();
                            break;
                        case 4:
                            hargaMac4 = 200000;
                            namaMacbook4 = "Macbook Air Pro 512Gb";
                            sm4 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliMacType4 = input.nextInt();
                            break;
                        case 5:
                            hargaMac5 = 200000;
                            namaMacbook5 = "Macbook Pro M1";
                            sm5 = true;
                            System.out.println("Masukkan berapa jumlah pembelian : ");
                            beliMacType5 = input.nextInt();
                            break;
                        default:
                            System.out.println("Menu tidak tersedia");
                    }
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }
            System.out.println("Apakah anda ingin menghitung ulang ? [Y/T]");
            ulang = br.readLine();
        }
        hitungHarga();
    }

    int hitungHarga() throws IOException {
        int totalSemua;
        if (hp1 == true) {
            totalHp1 = hargaHp1 * beliHpType1;
            productList.add(new Product(nama1, beliHpType1, hargaHp1));
            System.out.println("Total beli " + totalHp1);
        }

        if (hp2 == true) {
            totalHp2 = hargaHp2 * beliHpType2;
            System.out.println("Total beli " + totalHp2);
            productList.add(new Product(nama2, beliHpType2, hargaHp2));
        }

        if (hp3 == true) {
            totalHp3 = hargaHp3 * beliHpType3;
            System.out.println("Total beli " + totalHp3);
            productList.add(new Product(nama3, beliHpType3, hargaHp3));
        }

        if (hp4 == true) {
            totalHp4 = hargaHp4 * beliHpType4;
            System.out.println("Total beli " + totalHp4);
            productList.add(new Product(nama4, beliHpType4, hargaHp4));
        }

        if (hp5 == true) {
            totalHp5 = hargaHp5 * beliHpType5;
            System.out.println("Total beli " + totalHp5);
            productList.add(new Product(nama5, beliHpType5, hargaHp5));
        }

        if (tws1 == true) {
            totalTws1 = hargaTws1 * beliTwsType1;
            System.out.println("Total beli " + totalTws1);
            productList.add(new Product(namaTws1, beliTwsType1, hargaTws1));

        }

        if (tws2 == true) {
            totalTws2 = hargaTws2 * beliTwsType2;
            System.out.println("Total beli " + totalTws2);
            productList.add(new Product(namaTws2, beliTwsType2, hargaTws2));
        }

        if (tws3 == true) {
            totalTws3 = hargaTws3 * beliTwsType3;
            System.out.println("Total beli " + totalTws3);
            productList.add(new Product(namaTws3, beliTwsType3, hargaTws3));
        }

        if (tws4 == true) {
            totalTws4 = hargaTws4 * beliTwsType4;
            System.out.println("Total beli " + totalTws4);
            productList.add(new Product(namaTws4, beliTwsType4, hargaTws4));
        }

        if (tws5 == true) {
            totalTws5 = hargaTws5 * beliTwsType5;
            System.out.println("Total beli " + totalTws5);
            productList.add(new Product(namaTws5, beliTwsType5, hargaTws5));
        }

        if (sm1 == true) {
            totalSm1 = hargaMac1 * beliMacType1;
            System.out.println("Total beli " + totalSm1);
            productList.add(new Product(namaMacbook1, beliMacType1, hargaMac1));
        }
        if (sm2 == true) {
            totalSm2 = hargaMac2 * beliMacType2;
            System.out.println("Total beli " + totalSm2);
            productList.add(new Product(namaMacbook2, beliMacType2, hargaMac2));
        }

        if (sm3 == true) {
            totalSm3 = hargaMac3 * beliMacType3;
            System.out.println("Total beli " + totalSm3);
            productList.add(new Product(namaMacbook3, beliMacType3, hargaMac3));
        }

        if (sm4 == true) {
            totalSm4 = hargaMac4 * beliMacType4;
            System.out.println("Total beli " + totalSm4);
            productList.add(new Product(namaMacbook4, beliMacType4, hargaMac4));
        }

        if (sm5 == true) {
            totalSm5 = hargaMac5 * beliMacType5;
            System.out.println("Total beli " + totalSm5);
            productList.add(new Product(namaMacbook5, beliMacType5, hargaMac5));
        }


        totalSemua = totalHp1 + totalHp2 + totalHp3 + totalHp4 + totalHp5 +
                totalTws1 + totalTws2 + totalTws3 + totalTws4 + totalTws5 +
                totalSm1 + totalSm2 + totalSm3 + totalSm4 + totalSm5;
        ;

        System.out.println("Total Pembayaran adalah " + totalSemua);
        System.out.println("Masukkan Uang Pembayaran Rp. ");
        do {
//            pembayaran = input.nextInt();
            pembayaran = Integer.parseInt(br.readLine());
            kembalian = pembayaran - totalSemua;
            if (String.valueOf(kembalian).contains("-")) {
                System.out.println("Pastikan uang yang anda bayar tidak kurang");
            }
        } while (String.valueOf(kembalian).contains("-"));


        System.out.println("Uang kembalian anda " + kembalian);
        System.out.println("Lengkapi Data Pembeli");
        System.out.println("Nama Pembeli");
        namaPembeli = br.readLine();
        System.out.println("No Hp Pembeli");
        noHpPembeli = br.readLine();
        System.out.println("Alamat Pembeli");
        alamatPembeli = br.readLine();
        return kembalian;
    }

    void generateInvoice() throws FileNotFoundException {
        String path = "invoice.pdf";
        PdfWriter writer = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(writer);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twoColumnWidth[] = {twocol150, twocol};
        float threecol = 190f;
        float threeColumnWidth[] = {threecol, threecol, threecol};
        float fullwidth[] = {threecol * 3};
        Paragraph onesp = new Paragraph("\n");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dateNow = formatter.format(date);



        Table table = new Table(twoColumnWidth);
        table.addCell(new Cell().add("Invoice").setBorder(Border.NO_BORDER).setBold().setFontSize(20f));
        Table nestedTable = new Table(new float[]{twocol / 2, twocol / 2});
        nestedTable.addCell(getHeaderTextCell("Invoice No"));
        nestedTable.addCell(getHeaderTextCellValue("IX259920"));
        nestedTable.addCell(getHeaderTextCell("Invoice Date"));
        nestedTable.addCell(getHeaderTextCellValue("19/08/2020"));
        table.addCell(new Cell().add(nestedTable).setBorder(Border.NO_BORDER));

        Border bd = new SolidBorder(Color.GRAY, 2f);
        Table divider = new Table(fullwidth);
        divider.setBorder(bd);
        document.add(table);
        document.add(onesp);
        document.add(divider);
        document.add(onesp);


        Table twocoltable = new Table(twoColumnWidth);
        twocoltable.addCell(getBillingAndShippingCell("Informasi Penjual"));
        twocoltable.addCell(getBillingAndShippingCell("Informasi Pembeli"));
        document.add(twocoltable.setMarginBottom(12f));

        Table twocoltable2 = new Table(twoColumnWidth);
        twocoltable2.addCell(getCell10fLeft("Company", true));
        twocoltable2.addCell(getCell10fLeft("Name", true));
        twocoltable2.addCell(getCell10fLeft("Pt. Arunika", false));
        twocoltable2.addCell(getCell10fLeft(namaPembeli, false));
        document.add(twocoltable2);

        Table twocoltable3 = new Table(twoColumnWidth);
        twocoltable3.addCell(getCell10fLeft("officer Name", true));
        twocoltable3.addCell(getCell10fLeft("Address", true));
        twocoltable3.addCell(getCell10fLeft(namaPegawai, false));
        twocoltable3.addCell(getCell10fLeft(alamatPembeli, false));
        document.add(twocoltable3);

        Table twocoltable5 = new Table(twoColumnWidth);
        twocoltable5.addCell(getCell10fLeft("No Hp", true));
        twocoltable5.addCell(getCell10fLeft("No Hp", true));
        twocoltable5.addCell(getCell10fLeft("08111111", false));
        twocoltable5.addCell(getCell10fLeft(noHpPembeli, false));
        document.add(twocoltable5);

        float oneColumnWidth[] = {twocol150};
        Table oneColtable1 = new Table(oneColumnWidth);
        oneColtable1.addCell(getCell10fLeft("Address", true));
        oneColtable1.addCell(getCell10fLeft("Bandung barat", false));
        oneColtable1.addCell(getCell10fLeft("Email", true));
        oneColtable1.addCell(getCell10fLeft("fff@gmail.com", false));
        document.add(oneColtable1.setMarginBottom(10f));

        Border dgb = new DashedBorder(Color.GRAY, 0.5f);
        Table tableDivider2 = new Table(fullwidth);
        document.add(tableDivider2.setBorder(dgb));
        Paragraph productParaghranch = new Paragraph("Products");
        document.add(productParaghranch.setBold());

        Table threeColTable1 = new Table(threeColumnWidth);
        threeColTable1.setBackgroundColor(Color.BLACK, 0.7f);

        threeColTable1.addCell(new Cell().add("Description").setBold().setFontColor(Color.WHITE).setBorder(Border.NO_BORDER));
        threeColTable1.addCell(new Cell().add("Quantity").setFontColor(Color.WHITE).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        threeColTable1.addCell(new Cell().add("Price").setFontColor(Color.WHITE).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        document.add(threeColTable1);


        int totalSum = 0;

        Table threeColTable2 = new Table(threeColumnWidth);
        for (Product product : productList) {
            int total = product.getQuantity() * product.getPrice();
            totalSum += total;
            threeColTable2.addCell(new Cell().add(product.getName()).setBorder(Border.NO_BORDER));
            threeColTable2.addCell(new Cell().add(String.valueOf(product.getQuantity())).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
            threeColTable2.addCell(new Cell().add(standardizePrice(total)).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER).setMarginRight(15f));
        }
        document.add(threeColTable2.setMarginBottom(20f));

        float oneTwo[] = {threecol + 125f, threecol * 2};
        Table threeColTable4 = new Table(oneTwo);
        threeColTable4.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
        threeColTable4.addCell(new Cell().add(tableDivider2).setBorder(Border.NO_BORDER));
        document.add(threeColTable4);

        Table threeColTable3 = new Table(threeColumnWidth);
        threeColTable3.addCell(new Cell().add("").setBorder(Border.NO_BORDER)).setMarginLeft(10f);
        threeColTable3.addCell(new Cell().add("Total").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        threeColTable3.addCell(new Cell().add(standardizePrice(totalSum)).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        document.add(threeColTable3);
        document.add(tableDivider2);

        float oneThree[] = {threecol + 125f, threecol * 2};
        Table threeColTable7 = new Table(oneThree);
        threeColTable4.addCell(new Cell().add("").setBorder(Border.NO_BORDER));
        threeColTable4.addCell(new Cell().add(tableDivider2).setBorder(Border.NO_BORDER));
        document.add(threeColTable7);

        Table threeColTable5 = new Table(threeColumnWidth);
        threeColTable5.addCell(new Cell().add("").setBorder(Border.NO_BORDER)).setMarginLeft(10f);
        threeColTable5.addCell(new Cell().add("Dibayar").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        threeColTable5.addCell(new Cell().add(standardizePrice(pembayaran)).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        document.add(threeColTable5);

        Table threeColTable6 = new Table(threeColumnWidth);
        threeColTable6.addCell(new Cell().add("").setBorder(Border.NO_BORDER)).setMarginLeft(10f);
        threeColTable6.addCell(new Cell().add("Kembalian").setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER));
        threeColTable6.addCell(new Cell().add(standardizePrice(kembalian)).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        document.add(threeColTable6);
        document.add(new Paragraph("\n"));


        document.add(divider.setBorder(new SolidBorder(Color.GRAY, 1)).setMarginBottom(15f));


        document.close();
        System.out.println("PDF GENERATED");

    }

    static Cell getHeaderTextCell(String textValue) {
        return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
    }

    static Cell getHeaderTextCellValue(String textValue) {
        return new Cell().add(textValue).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
    }

    static Cell getBillingAndShippingCell(String textValue) {
        return new Cell().add(textValue).setFontSize(12f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
    }

    static Cell getCell10fLeft(String textValue, Boolean isBold) {
        Cell myCell = new Cell().add(textValue).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
        return isBold ? myCell.setBold() : myCell;
    }

    private String standardizePrice(int price) {
        double amount = price;
        String totalHarga;
        totalHarga = String.format("%,.2f", amount);
        return totalHarga;
    }

}
