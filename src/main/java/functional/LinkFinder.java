package functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkFinder {

    public static final String HREF = " href=\"";
    public String getLink(String line){
        var index = line.indexOf("href");
        var index2 = line.indexOf("\"",index + HREF.length() );
        var part = line.substring(index + HREF.length(),index2);

        return part;
    }

    private boolean byLink(String s) {
        return s.contains(HREF);
    }

    public String getLinkWithRegexp(String line){
        Pattern pattern = Pattern.compile("href=\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(line);
        //matcher.
        if(matcher.find()){
            return  matcher.group(1);

        }
        else{
            throw new IllegalArgumentException("No Match");
        }
    }
    public void getLinks(Path file) throws IOException{

        try (var lines = Files.lines(file)) {
            lines
                    .filter(this::byLink)
                    .map(this::getLink)
                    .filter(s -> s.startsWith("http"))
                    .limit(10)
                    .peek(System.out::println)
                    //.map(s -> download(s))
                    //.filter(r -> r.statusCode() !=200)
            ;

        }
    }



    public static void main(String[] args) throws IOException {

        //new LinkFinder().getLinks(Path.of("https_index.hu_.txt"));

        System.out.println(new LinkFinder().getLinkWithRegexp("<a class=c-index2-pager_link href=https://cimlap.blog.hu/>"));
        /*
        System.out.print("koronavírus darabszáma: ");
        System.out.println()
                .filter(s -> s.contains("koronavírus"))
                .count());

        System.out.print("href darabszáma: ");
        System.out.println(Files.lines(Path.of("C:\\Users\\Training\\IdeaProjects\\java-training\\src\\https_index.hu_.txt"))
                .filter(s -> s.contains("href=")).count());
       */



    }
}
