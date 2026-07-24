package Polymorphism.Overloading;

public class AIImageGenerator {
    String prompt;
    String style;
    String resolution;
    double generationTime;

    void generateImage(String prompt){
        this.prompt =prompt;
        System.out.println("Prompt: "+prompt);
        System.out.println("style  = Realistic");
        System.out.println( "Resolution:"+(resolution = "1024*1024"));
        generationTime = 25.2;
        System.out.println("Generation Time: "+generationTime);
    }

    void generateImage(String prompt, String style){
        this.prompt =prompt;
        this.style =style;
        System.out.println("Prompt: "+prompt);
        System.out.println("Style: "+style);
        System.out.println("Resolution: "+(resolution = "512*1024"));;
        generationTime = 15.2;
        System.out.println("Generation Time: "+generationTime);
    }


    public static void main(String[] args) {
        AIImageGenerator obj = new AIImageGenerator();
        obj.generateImage("Image Specifying the colours of Nature");
        System.out.println("----------------------------------------------");
        obj.generateImage("A portrait image", "Anime");
    }
}
