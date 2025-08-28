import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager pm = new PostManager();


        String postTitle = "Java Programming Tips";
        int engagementScore = pm.calculateEngagement(150, 75, 25);


        pm.displayPostStats(postTitle, engagementScore);
        String category = pm.getCategoryRating(engagementScore);
        pm.displayPostStats(postTitle, engagementScore, category);


        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);


        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Spring Boot Guide");
        posts.add("Beginner Coding Tricks");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Spring Boot Guide", 600);
        postEngagement.put("Beginner Coding Tricks", 40);

        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);


        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);
    }
}

