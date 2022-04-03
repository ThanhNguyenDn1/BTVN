class ChuNhatDemo {
    private HinhCN hinhCN;
    private String maHinhCN;
    private ChuNhatDemo[] list;
    ChuNhatDemo(){
        this.hinhCN=new HinhCN();
        this.maHinhCN="";
    }

    public void NhapHinhChuNhat() {
        list = new ChuNhatDemo[10];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Thong tin Hinh CN" + i + ": ");
            list[i] = new ChuNhatDemo();
            list[i].hinhCN.nhapThongTinHinhCN();
            list[i].maHinhCN = "CN " + i;
        }
    }

    public void xuatDanhSachHinhCN() {
        for (int i = 0; i <= list.length; i++) {
            System.out.println("Thong tin Hinh CN" + i + ": ");
            System.out.println("\t Ma Hinh Chu Nhat: " + list[i].maHinhCN);
            System.out.println("\t Chieu Dai Hinh Chu Nhat: " + list[i].hinhCN.xuatThongTinHinhCN());
            System.out.println("\t Chieu Rong Hinh Chu Nhat: " + list[i].hinhCN.xuatThongTinHinhCN());
            System.out.println("\t Chu Vi Hinh Chu Nhat: " + list[i].hinhCN.tinhCV());
            System.out.println("\t Dien Tich Hinh Chu Nhat: " + list[i].hinhCN.tinhDT());

        }
    }

    public void HinhCNDienTichLonNhat() {
        float max = list[0].hinhCN.tinhDT();
        int indexMax = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].hinhCN.tinhDT() > max) {
                max = list[i].hinhCN.tinhDT();
                indexMax = i;
            }
        }
        System.out.println("Thong tin Hinh CN Co Dien Tich Lon Nhat La" + indexMax);
        System.out.println("\t Ma Hinh Chu Nhat: " + list[indexMax].maHinhCN);
        System.out.println("\t Chieu Dai Hinh Chu Nhat: " + list[indexMax].hinhCN.xuatThongTinHinhCN());
        System.out.println("\t Chieu Rong Hinh Chu Nhat: " + list[indexMax].hinhCN.xuatThongTinHinhCN());
        System.out.println("\t Chu Vi Hinh Chu Nhat: " + list[indexMax].hinhCN.tinhCV());
        System.out.println("\t Dien Tich Hinh Chu Nhat: " + list[indexMax].hinhCN.tinhDT());
    }

    public void HinhCNDienTichNhoNhat() {
        float min = list[0].hinhCN.tinhDT();
        int indexMax = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].hinhCN.tinhDT() < min) {
                min = list[i].hinhCN.tinhDT();
                indexMax = i;
            }
        }
        System.out.println("Thong tin Hinh CN Co Dien Tich Nho Nhat La" + indexMax);
        System.out.println("\t Ma Hinh Chu Nhat: " + list[indexMax].maHinhCN);
        System.out.println("\t Chieu Dai Hinh Chu Nhat: " + list[indexMax].hinhCN.xuatThongTinHinhCN());
        System.out.println("\t Chieu Rong Hinh Chu Nhat: " + list[indexMax].hinhCN.xuatThongTinHinhCN());
        System.out.println("\t Chu Vi Hinh Chu Nhat: " + list[indexMax].hinhCN.tinhCV());
        System.out.println("\t Dien Tich Hinh Chu Nhat: " + list[indexMax].hinhCN.tinhDT());
    }
}