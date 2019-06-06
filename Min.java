public class Min {
    public static void main(String[] args) {
        int[]mang={2,7,12,1,5,6,7};
        System.out.print("mang = ");
        for (int i=0 ; i<mang.length ; i++){
            System.out.print( mang[i] + "\t");
        }
        int kq=kiemtra(mang);
        System.out.println(" co Min ="+kq);
    }
    public static int kiemtra(int[]mang){
        int min=mang[0];
        for (int i=0;i<mang.length ; i++){
            if (mang[i]<min){
                min=mang[i];
            }
        }
        return min;
    }
}
