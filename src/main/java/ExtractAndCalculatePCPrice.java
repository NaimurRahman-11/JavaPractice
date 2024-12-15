public class ExtractAndCalculatePCPrice {
    public static void main(String[] args) {
        String inputText = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        inputText = inputText.replaceAll("\\D", " ");
        inputText = inputText.trim();
        inputText = inputText.replaceAll(" +", " ");
        String[] arr = (inputText.split(" "));

        double laptopPrice = Double.parseDouble(arr[1]);
        double mousePrice = Double.parseDouble(arr[2]);
        double discountPercentage = Double.parseDouble(arr[4]);

        System.out.println("Laptop Price: " +laptopPrice);
        System.out.println("Mouse Price: " +mousePrice);
        System.out.println("Discount Percentage: " +discountPercentage);

        double finalPrice = calculateTotalPrice(laptopPrice, mousePrice, discountPercentage);
        System.out.println("Total Price after " + discountPercentage + "% discount: " + finalPrice);

    }

    public static double calculateTotalPrice(double laptopPrice, double mousePrice, double discountPercentage){
        double totalPrice = laptopPrice + mousePrice;
        double discountAmount = totalPrice * (discountPercentage / 100);
        double finalPrice = totalPrice - discountAmount;
        return finalPrice;
    }
}
