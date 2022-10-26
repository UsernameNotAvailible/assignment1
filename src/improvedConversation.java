import java.util.Scanner;
public class improvedConversation {
    public static void main(String[] args) {
        System.out.println("What's your name");
        Scanner name = new Scanner (System.in);
        String userName = name.next();
        System.out.println("How old are you, " + userName);
        Scanner age = new Scanner (System.in);
        String ageS = age.next();
        double userAge = Double.valueOf(ageS); // more useful like this
        System.out.println("What is your favourite genre?");
        Scanner genre = new Scanner(System.in);
        String userGenre = genre.next();
        userGenre = userGenre.toLowerCase(); //Making life simpler, increasing acceptable user input manyfold

        if (userAge >= 13 && userAge < 17) {
            switch (userGenre) {
                case "action and adventure":
                case "action/adventure":
                case "action":
                case "adventure": // many options for a user to make a mistake
                    System.out.println("'Kino's Journey' by Keiichi Sigsawa may turn out to be your liking");
                    break;
                case "historical fiction":
                case "period fiction":
                case "historical":
                case "period drama":
                    System.out.println("'Angelique' by Anne Golan");
                    break;
                case "history":
                    System.out.println("'Ascanio' by Alexandre Dumas");
                    break;
                    // horror-related
                case "horror":
                    System.out.println("'The Graveyard Book' by Neil Gaiman, not sure if it fits, but definitely a good book");
                    break;
                case "suspense and thrillers":
                case "suspense":
                case "thriller":
                    System.out.println("'Little Monsters' by Kara Thomas seems like an option to try out");
                    break;
                case "detective":
                case "mystery":
                case "detective and mystery":
                    System.out.println("Maybe you'll enjoy 'Overturned' by Lamar Giles");
                    break;
                    //
                case "classic":
                case "classics":
                    System.out.println("'I Capture the Castle' by Dodie Smith seems like it's worth a try");
                    break;
                case "romance":
                    System.out.println("'To All The Boys I’ve Loved Before' seems like a good advice. Sorry, I'm not an expert on romance");
                    break;
                    //
                case "non-fiction":
                case "nonfiction":
                case "non fiction":
                    System.out.println("'Pale Blue Dot: A Vision of the Human Future in Space' by Carl Sagan. Nothing to add, just read it");
                    break;
                    // high fiction? Things far removed from the reality
                case "science fiction":
                case "sci-fi":
                case "sci fi":
                case "scifi":
                case "science-fiction":
                    System.out.println("'Hyperion' by Den Simmons may be worth a try");
                    break;
                case "space opera":
                    System.out.println("'Dune' by Frank Herbert");
                    break;
                case "fantasy":
                    System.out.println("'A Wizard of Earthsea' by Ursula K. Le Guin is one of the better choices you can make here");
                    break;
                case "dystopia":
                case "antiutopia":
                case "anti-utopia":
                case "anti utopia":
                    System.out.println("'Hunger Games'? Sorry, I am not familiar with teen dystopias. Just don't waste your time on 'Divergent'");
                    break;
                //the odd ones
                case "self-help":
                case "self help":
                    System.out.println("Maybe not? There are, probably, some genuinly good ones, but I don't know them and can't, in good faith, recommend any");
                    break;
                case "poetry":
                    System.out.println("'A Forest Song' by Lesya Ukrainka, a staple of Ukrainian literature");
                    break;
                case "conlang":
                case "conlangs":
                    System.out.println("I suggest you read 'Toki Pona: The Language Of Good' by Sonja Lang");
                    break;
                default:
                    System.out.println("Either you made a typo, or I failed to include this genre/have no advice on it");
            }
        }
        else if (userAge >= 17 && userAge <= 25) {
            switch (userGenre) {
                case "action and adventure":
                case "action/adventure":
                case "action":
                case "adventure":
                    System.out.println("'Stardust' by Neil Gaiman");
                    break;
                case "historical fiction":
                case "historical":
                case "period fiction":
                    System.out.println("Personally, I really enjoyed 'She Who Became The Sun' a debut work of Shelly Parker-Chan, and maybe you will too");
                    break;
                case "history":
                    System.out.println("Maybe try 'The Guns of August' by Barbara Tuchman");
                    break;
                    // horror-related
                case "horror":
                    System.out.println("Try 'Something Wicked This Way Comes' by Ray Bradbury");
                    break;
                case "suspense and thrillers":
                case "suspense":
                case "thriller":
                    System.out.println("'The Other Black Girl' by Zakiya Dalila Harris");
                    break;
                case "detective":
                case "mystery":
                case "detective and mystery":
                    System.out.println("Maybe you'll enjoy 'Murder on the Orient Express' by Agatha Christie");
                    break;
                case "true crime":
                    System.out.println("'In Cold Blood' by Truman Capote. An originator of the genre must be good");
                    break;
                    //
                case "classic":
                case "classics":
                    System.out.println("Maybe you would enjoy reading 'Little Women' by Louisa May Alcott, on which the similarly named 2019 movie was based");
                    break;
                case "romance":
                    System.out.println("'Delilah Green Doesn't Care' by Ashley Herring Blake. I'm not an expert on romance, but it seemed interesting");
                    break;
                    //
                case "non-fiction":
                case "nonfiction":
                case "non fiction":
                    System.out.println("'Pale Blue Dot: A Vision of the Human Future in Space' by Carl Sagan. Nothing to add, just read it");
                    break;
                    //high fiction? Things far removed from the reality
                case "science fiction":
                case "sci-fi":
                case "sci fi":
                case "scifi":
                case "science-fiction":
                    System.out.println("If you haven't yet, you absolutely mast read 'Foundation' by Isaac Asimov");
                    break;
                case "fantasy":
                    System.out.println("You definitely should acquaint yourself with the world of Discworld by Terry Pratchett");
                    break;
                case "dystopia":
                case "antiutopia":
                case "anti-utopia":
                case "anti utopia":
                    System.out.println("'Animal Farm' by George Orwell");
                    break;
                    // the odd ones
                case "self-help":
                case "self help":
                    System.out.println("I suggest you don't read self help books. There are, probably, some genuinly good ones, but I don't know them and can't, in good faith, recommend any");
                    break;
                case "poetry":
                    System.out.println("Maya Angelou: “Still I Rise“");
                    break;
                case "conlang":
                case "conlangs":
                    System.out.println("I suggest you read 'Toki Pona: The Language Of Good' by Sonja Lang");
                    break;
                default:
                    System.out.println("Either you made a typo, or I failed to include this genre/have no advice on it");
            }
        }
        else if (userAge > 25) {
            switch (userGenre) {
                case "action and adventure":
                case "action/adventure":
                case "action":
                case "adventure":
                    System.out.println("'Journey to the Centre of the Earth' by Jules Verne. Read it if you haven't");
                    break;
                case "historical fiction":
                case "historical":
                case "period fiction":
                    System.out.println("'Alias Grace' by Margaret Atwood, give it a try");
                    break;
                case "history":
                    System.out.println("'Parallel Lives' by Plutarch may be a good option");
                    break;
                    // horror-related
                case "horror":
                    System.out.println("If you haven't yet, you should, probably, try 'Interview with the Vampire' by Anne Rice");
                    break;
                case "suspense and thrillers":
                case "suspense":
                case "thriller":
                    System.out.println("'The Silence of the Lambs' by Thomas Harris, you, probably, heard of it, but haven't read");
                    break;
                case "detective":
                case "mystery":
                case "detective and mystery":
                    System.out.println("Maybe you'll enjoy ");
                    break;
                    //
                case "classic":
                case "classics":
                    System.out.println("One of the most influential novels in English language 'Middlemarch' by George Eliot");
                    break;
                case "romance":
                    System.out.println("'Delta of Venus' by Anais Nin. Again, not an expert on romance, but that would be mine suggestion");
                    break;
                    //
                case "non-fiction":
                case "nonfiction":
                case "non fiction":
                    System.out.println("'Pale Blue Dot: A Vision of the Human Future in Space' by Carl Sagan. Nothing to add, just read it");
                    break;
                    // high fiction? Things far removed from the reality
                case "science fiction":
                case "sci-fi":
                case "sci fi":
                case "scifi":
                case "science-fiction":
                    System.out.println("'All Systems Red' by Martha Wells may be an enjoyable read for you");
                    break;
                case "fantasy":
                    System.out.println("'The Fifth Season' by N. K. Jemisin is definitely worth a try");
                    break;
                case "dystopia":
                case "antiutopia":
                case "anti-utopia":
                case "anti utopia":
                    System.out.println("'Handmaid's Tale' by Margaret Atwood. A must read ");
                    break;
                    // the odd ones
                case "self-help":
                case "self help":
                    System.out.println("I suggest you don't read self help books. There are, probably, some genuinely good ones, but I don't know them and can't, in good faith, recommend any");
                    break;
                case "poetry":
                    System.out.println("That's worth a read: Percy Bysshe Shelley's “Ozymandias“");
                    break;
                case "conlang":
                case "conlangs":
                    System.out.println("I suggest you read 'Toki Pona: The Language Of Good' by Sonja Lang");
                    break;
                default:
                    System.out.println("Either you made a typo, or I failed to include this genre/have no advice on it");
            }
        }
        else if (userAge >= 0 && userAge < 13) {System.out.println("Sorry, no advice for you");}
        else {System.out.println("No negative ages, please");}

    }
}
