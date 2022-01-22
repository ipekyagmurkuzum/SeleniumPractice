//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//
//public class WebScraper {
//
//    public static void main(String[] args) throws IOException {
//
//        Document document = null;
//        FileWriter urlsFile = new FileWriter("src/test/resources/urls_file.csv");
//        urlsFile.write("Category, URLs\n");
//        document = Jsoup.connect("https://n11.com/kampanyalar").get();
//
//        try {
//            Elements links = document.select("section.group.category-11 a[href]");
//            for (Element link : links) {
//
//                urlsFile.write("Moda," + link.attr("href") + "\n");
//            }
//
//            Elements links2 = document.select("section.group.category-12 a[href]");
//            for (Element link : links2) {
//
//                urlsFile.write("Elektronik," + link.attr("href") + "\n");
//            }
//
//            Elements links3 = document.select("section.group.category-13 a[href]");
//            for (Element link : links3) {
//
//                urlsFile.write("Ev & Yaşam," + link.attr("href") + "\n");
//            }
//
//
//            Elements links4 = document.select("section.group.category-14 a[href]");
//            for (Element link : links4) {
//
//                urlsFile.write("Anne & Bebek," + link.attr("href") + "\n");
//            }
//
//
//            Elements links5 = document.select("section.group.category-15 a[href]");
//            for (Element link : links5) {
//
//                urlsFile.write("Kozmetik & Kişisel Bakım," + link.attr("href") + "\n");
//            }
//
//            Elements links6 = document.select("section.group.category-16 a[href]");
//            for (Element link : links6) {
//
//                urlsFile.write("Mücevher & Saat," + link.attr("href") + "\n");
//            }
//
//
//            Elements links7 = document.select("section.group.category-17 a[href]");
//            for (Element link : links7) {
//
//                urlsFile.write("Spor & Outdoor," + link.attr("href") + "\n");
//            }
//
//
//            Elements links8 = document.select("section.group.category-18 a[href]");
//            for (Element link : links8) {
//
//                urlsFile.write("Kitap & Müzik & Film & Oyun," + link.attr("href") + "\n");
//            }
//
//
//            Elements links9 = document.select("section.group.category-110 a[href]");
//            for (Element link : links9) {
//
//                urlsFile.write("Otomotiv & Motosiklet," + link.attr("href") + "\n");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        urlsFile.close();
//    }
//}