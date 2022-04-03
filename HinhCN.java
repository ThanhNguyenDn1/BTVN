import java.util.Scanner;

public class HinhCN extends HinhPhang {

    private int chieuRong, chieuDai;

    HinhCN(int r, int d) {
        this.chieuDai = d;
        this.chieuRong = r;
    }
    HinhCN(){
        
    }

    @Override
    float tinhCV() {
        return (chieuDai + chieuRong) / 2;
    }

    @Override
    float tinhDT() {
        return chieuDai * chieuRong;
    }

    public void nhapThongTinHinhCN() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap Thong Tin Chieu Dai||Rong(Dai =Rong): ");
            this.chieuDai = scanner.nextInt();
        } while (this.chieuDai > 100 || this.chieuDai < 1);

        this.chieuRong = this.chieuDai;
    }

    public int xuatThongTinHinhCN() {
        return this.chieuDai;
    }

    public void xuatDienTichHinhCN() {
        System.out.println("\tDien Tich Hinh CN  " + tinhDT());
    }

    public void xuatCHuViHinhCN() {
        System.out.println("\tDien Tich Hinh CN  " + tinhCV());
    }

}
