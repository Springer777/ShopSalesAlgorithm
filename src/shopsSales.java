import java.util.Scanner;
import java.io.*;

public class shopsSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] highStreetSales = new int[3][4];
        int[][] mallBranchSales = new int[3][4];
        String[][] months = {{"January", "February", "March", "April"}, {"May", "June", "July", "August"}, {"September", "October", "November", "December"}};
        int monthlySales = 0;

        //{{42000, 52000, 46000, 50000}, {48000, 58000, 49000, 51000}, {50000, 60000, 58000, 61000}};
        //{{57000, 70000, 67000, 72000}, {63000, 67000, 65000, 69000}, {60000, 73000, 62000, 75000}};

        //accept inputs
        System.out.println("Input the sales figures for High Street Branch from January to December: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(months[i][j] + " : ");
                highStreetSales[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input the sales figures for Mall Branch from January to December: ");
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                System.out.print(months[i][j] + " : ");
                mallBranchSales[i][j] = scanner.nextInt();
            }
        }
        System.out.println("---------------------------------------------------------");

        System.out.println("THE RESPECTIVE MONTHLY COMBINED SALES FIGURES FOR THE TWO SHOPS ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                monthlySales = highStreetSales[i][j] + mallBranchSales[i][j];

                System.out.println("The sales for " + months[i][j] + " is " + monthlySales);
            }
        }

        System.out.println("----------------------------------------------------------");

        //Each shop quarterly sales
        System.out.println("EACH SHOP QUARTERLY SALES ");
        int highStreetQuarterly_1 = highStreetSales[0][0] + highStreetSales[0][1] + highStreetSales[0][2];
        int highStreetQuarterly_2 = highStreetSales[0][3] + highStreetSales[1][0] + highStreetSales[1][1];
        int highStreetQuarterly_3 = highStreetSales[1][2] + highStreetSales[1][3] + highStreetSales[2][0];
        int highStreetQuarterly_4 = highStreetSales[2][1] + highStreetSales[2][2] + highStreetSales[2][3];

        System.out.println("The quarterly sales for High Street Branch: ");
        System.out.println("Quarter 1: " + highStreetQuarterly_1);
        System.out.println("Quarter 2: " + highStreetQuarterly_2);
        System.out.println("Quarter 3: " + highStreetQuarterly_3);
        System.out.println("Quarter 4: " + highStreetQuarterly_4);

        int mallBranchQuarterly_1 = mallBranchSales[0][0] + mallBranchSales[0][1] + mallBranchSales[0][2];
        int mallBranchQuarterly_2 = mallBranchSales[0][3] + mallBranchSales[1][0] + mallBranchSales[1][1];
        int mallBranchQuarterly_3 = mallBranchSales[1][2] + mallBranchSales[1][3] + mallBranchSales[2][0];
        int mallBranchQuarterly_4 = mallBranchSales[2][1] + mallBranchSales[2][2] + mallBranchSales[2][3];

        System.out.println("The quarterly sales for Mall Branch: ");
        System.out.println("Quarter 1: " + mallBranchQuarterly_1);
        System.out.println("Quarter 2: " + mallBranchQuarterly_2);
        System.out.println("Quarter 3: " + mallBranchQuarterly_3);
        System.out.println("Quarter 4: " + mallBranchQuarterly_4);
        System.out.println("----------------------------------------------------");

        //combined respective quarterly sales figure for the two shops
        System.out.println("Thw combined respective quarterly sales figure for the two shops: ");
        System.out.println("Combined quarter 1: " + (highStreetQuarterly_1 + mallBranchQuarterly_1));
        System.out.println("Combined quarter 2: " + (highStreetQuarterly_2 + mallBranchQuarterly_2));
        System.out.println("Combined quarter 3: " + (highStreetQuarterly_3 + mallBranchQuarterly_3));
        System.out.println("Combined quarter 4: " + (highStreetQuarterly_4 + mallBranchQuarterly_4));
        System.out.println("-----------------------------------------------------");

        //The respective shop annual sales figure
        int highStreetAnnualSales = 0;
        System.out.println("THE RESPECTIVE SHOP ANNUAL SALES FIGURE ");

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                highStreetAnnualSales += highStreetSales[i][j];
            }
        }
        System.out.println("The annual sales figure for High Street Branch: " + highStreetAnnualSales);

        int mallBranchAnnualSales = 0;

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                mallBranchAnnualSales += mallBranchSales[i][j];
            }
        }
        System.out.println("The annual sales figure for Mall Branch: " + mallBranchAnnualSales);

        System.out.println("-----------------------------------------------------");
        //the grand annual combined total sales figure
        int totalSalesFigure = highStreetAnnualSales + mallBranchAnnualSales;
        System.out.println("The grand annual combined total sales figure is " + totalSalesFigure);


    }

}
    