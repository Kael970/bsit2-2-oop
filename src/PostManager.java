import java.util.*;

public class PostManager {


    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0; // edge case: no interactions
        }
        int total = 0;
        for (int i : interactions) {
            total += i;
        }
        return total;
    }


    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) return new ArrayList<>();


        String[] fixedSize = new String[5];
        for (int i = 0; i < Math.min(hashtags.length, 5); i++) {
            fixedSize[i] = hashtags[i];
        }


        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(fixedSize));
        uniqueSet.remove(null); // remove null entries


        return new ArrayList<>(uniqueSet);
    }


    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();

        if (posts == null || postEngagement == null) return trending;

        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }


    public HashSet<String> getUniqueAuthors(String... authors) {
        if (authors == null) return new HashSet<>();
        return new HashSet<>(Arrays.asList(authors));
    }


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
