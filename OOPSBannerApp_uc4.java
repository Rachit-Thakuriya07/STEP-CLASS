public class OOPSBannerApp_uc4 {
   public static void main(String[] args) {

       
        String[] banner = {
        " *****    *****    ******    ****** ",
        "*     *  *     *   *     *   *      ",
        "*     *  *     *   *     *   *      ",
        "*     *  *     *   ******    ****** ",
        "*     *  *     *   *               *",
        "*     *  *     *   *               *",
        " *****    *****    *         ****** "    
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
