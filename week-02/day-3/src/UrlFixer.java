import com.sun.org.apache.xpath.internal.SourceTree;

public class UrlFixer {
    public static void main(String... args){
        String url1 = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String odds = url1.replace("bots", "odds");
        System.out.println(odds);

        char colon = ':';
        String url = odds.substring(0,5) + colon + odds.substring(5, odds.length());

        System.out.println(url);
    }
}

