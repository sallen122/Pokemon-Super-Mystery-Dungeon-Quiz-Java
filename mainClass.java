/*
* Pokémon Super Mystery Dungeon personality quiz recreated in Java
* Written by ZampNoxis
* 4/16/2019
* 1.0
* Pokémon(c)Game Freak
*/

import static java.lang.System.*;
import java.util.Random;
import java.util.Scanner;

public class mainClass {
    public static void main (String[] args) {
        //Each question initialized as an array of 2 except for question 6.
        String[] question1 = {"A nerve-racking first day at school! You want to make friends with someone you just met. What do you do?", "A new student transfers into your class. What do you do?"};
        String[] question2 = {"Disaster strikes! You've lost your wallet! Now what are you going to do?", "Two of your friends are fighting, and you wish they'd stop. What do you do first?"};
        String[] question3 = {"Everyone at school is talking about this great new book, but it's big and long...", "They start selling a new kind of pastry at your favorite bakery..."};
        String[] question4 = {"Halfway to school you realize you forgot something. You'll be late if you turn back...", "You've been hiking up a mountain for two hours but still haven't reached the peak..."};
        String[] question5 = {"All right! Dinnertime at last! You're starving, and you can hardly think about anything else except the chance to eat...", "You want to jump rope during recess, but everyone else wants to play tag..."};

        Scanner input = new Scanner(in);
        //Each question is randomized to pick 1 of the 2 questions per main question.
        int randQ1 = new Random().nextInt(question1.length);
        int randQ2 = new Random().nextInt(question2.length);
        int randQ3 = new Random().nextInt(question3.length);
        int randQ4 = new Random().nextInt(question4.length);
        int randQ5 = new Random().nextInt(question5.length);
        boolean sunny = false, calm = false, flexible = false, serious = false, cooperate = false;
        String userPokemon = "";

        //The question is outputted, then two answers specific to each question is outputted depending on the question chosen.
        out.println(question1[randQ1]);
        if (question1[randQ1].equals(question1[0])) {
            out.println("\n1)Turn to them and introduce yourself.\n2)Wait nervously for them to talk to you.");
        }
        else if (question1[randQ1].equals(question1[1])) {
            out.println("\n1)Offer to show them around the school.\n2)Wait to see what kind of person they are.");
        }
        out.print("\nEnter 1 or 2: ");
        int ans = input.nextInt();
        if (ans == 1 || ans == 2) {
            if (ans == 1) {
                sunny = true;
            }
            out.println("\n"+question2[randQ2]);
            if (question2[randQ2].equals(question2[0])) {
                out.println("\n1)Calm down and retrace your steps.\n2)Tear the place apart in a frantic search.");
            }
            else if (question2[randQ2].equals(question2[1])) {
                out.println("\n1)Ponder what the real issue is between them.\n2)Jump right into the fray to make them stop.");
            }
            out.print("\nEnter 1 or 2: ");
            ans = input.nextInt();
            if (ans == 1 || ans == 2) {
                if (ans == 1) {
                    calm = true;
                }

                out.println("\n"+question3[randQ3]);
                if (question3[randQ3].equals(question3[0])) {
                    out.println("\n1)Of course you get it! They say it's great!\n2)You don't want to read anything that long.");
                }
                else if (question3[randQ3].equals(question3[1])) {
                    out.println("\n1)You try the new variety without hesitation!\n2)You stick with your regular favorite.");
                }
                out.print("\nEnter 1 or 2: ");
                ans = input.nextInt();
                if (ans == 1 || ans == 2) {
                    if (ans == 1) {
                        flexible = true;
                    }

                    out.println("\n"+question4[randQ4]);
                    if (question4[randQ4].equals(question4[0])) {
                        out.println("\n1)You hurry back to get it anyway.\n2)You can't be bothered to get it now.");
                    }
                    else if (question4[randQ4].equals(question4[1])) {
                        out.println("\n1)You pump yourself up for one last push!\n2)You give up on it and head home.");
                    }
                    out.print("\nEnter 1 or 2: ");
                    ans = input.nextInt();
                    if (ans == 1 || ans == 2) {
                        if (ans == 1) {
                            serious = true;
                        }

                        out.println("\n"+question5[randQ5]);
                        if (question5[randQ5].equals(question5[0])) {
                            out.println("\n1)You wait until everyone is ready to start.\n2)You start eating as soon as you have your food.");
                        }
                        else if (question5[randQ5].equals(question5[1])) {
                            out.println("\n1)You give in and play tag with your friends.\n2)You convince all your friends to jump rope.");
                        }
                        out.print("\nEnter 1 or 2: ");
                        ans = input.nextInt();
                        if (ans == 1 || ans == 2) {
                            if (ans == 1) {
                                cooperate = true;
                            }

                            for (int i = 0; i < 50; i++) {
                                out.print("-");
                            }

                            out.println("\n");

                            //Boolean logic is done depending on user's inputs
                            if (!sunny && !calm && !flexible && !serious) {
                                out.println("Spring, summer, fall, or winter... Which season do you like best?\n\n"+
                                        "1) Spring, the season of buds and blooms!\n" +
                                        "2) Summer, the time for sea and sand!\n" +
                                        "3) Fall, when crickets chirp and dusk comes early.\n" +
                                        "4) Winter, when a blanket of snow covers all.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Chikorita";
                                        break;
                                    case 2:
                                        userPokemon = "Bulbasaur";
                                        break;
                                    case 3:
                                        userPokemon = "Turtwig";
                                        break;
                                    case 4:
                                        userPokemon = "Totodile";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're a little shy and perhaps too concerned with others' well-being.\n" +
                                        "\n" +
                                        "But that's precisely why you're so kind to those around you.\n" +
                                        "\n" +
                                        "That warm, caring personality must be..."+userPokemon+"!");
                            }
                            if (!sunny && !calm && serious && !cooperate) {
                                out.println("We're going to the beach! Best. Day. Ever." +
                                        "\n" +
                                        "Time to kick back and enjoy the breeze. What view do you find yourself staring at?\n\n"+
                                        "1) The glittering blue stretch of sea.\n" +
                                        "2) The endless expanse of the sky.\n" +
                                        "3) The sandy shore being lapped by waves.\n" +
                                        "4) The gently swaying strands of dune grass.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Piplup";
                                        break;
                                    case 2:
                                        userPokemon = "Froakie";
                                        break;
                                    case 3:
                                        userPokemon = "Chimchar";
                                        break;
                                    case 4:
                                        userPokemon = "Treecko";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nDo people think you're a loner? Or that you have an unapproachable aura?\n" +
                                        "\n" +
                                        "The truth is that you're a decisive person who's very sure of yourself!\n" +
                                        "\n" +
                                        "That strong personality must be..."+userPokemon+"!");
                            }
                            if (!sunny && !calm && !flexible && serious && cooperate) {
                                out.println("A wizard appears before you! He says he'll transform you into anything!" +
                                        "\n" +
                                        "What would you want to be?\n\n"+
                                        "1) A cute little critter, beloved by all!\n" +
                                        "2) A cold-blooded reptile with strength.\n" +
                                        "3) A freewheeling bird that wings across the sky!\n" +
                                        "4) A wild beast that is one with nature.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Pikachu";
                                        break;
                                    case 2:
                                        userPokemon = "Charmander";
                                        break;
                                    case 3:
                                        userPokemon = "Torchic";
                                        break;
                                    case 4:
                                        userPokemon = "Riolu";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou get along with everyone. You're well liked for cherishing your friends.\n" +
                                        "\n" +
                                        "You're unambitious and calm, but you're actually a hard worker who everyone admires.\n" +
                                        "\n" +
                                        "As popular as you are, you must be..."+userPokemon+"!");
                            }
                            if (!sunny && !calm && flexible && !serious && !cooperate) {
                                out.println("We're going to the beach! Best. Day. Ever." +
                                        "\n" +
                                        "Time to kick back and enjoy the breeze. What view do you find yourself staring at?\n\n"+
                                        "1) The glittering blue stretch of sea.\n" +
                                        "2) The endless expanse of the sky.\n" +
                                        "3) The sandy shore being lapped by waves.\n" +
                                        "4) The gently swaying strands of dune grass.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Piplup";
                                        break;
                                    case 2:
                                        userPokemon = "Froakie";
                                        break;
                                    case 3:
                                        userPokemon = "Chimchar";
                                        break;
                                    case 4:
                                        userPokemon = "Treecko";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou always trust your feelings, even if they get you in trouble sometimes.\n" +
                                        "\n" +
                                        "But clearly expressing your feelings is proof you want others to understand you.\n" +
                                        "\n" +
                                        "A straight shooter like you must be..."+userPokemon+"!");
                            }
                            if (!sunny && !calm && flexible && cooperate) {
                                out.println("Spring, summer, fall, or winter... Which season do you like best?\n\n"+
                                        "1) Spring, the season of buds and blooms!\n" +
                                        "2) Summer, the time for sea and sand!\n" +
                                        "3) Fall, when crickets chirp and dusk comes early.\n" +
                                        "4) Winter, when a blanket of snow covers all.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Chikorita";
                                        break;
                                    case 2:
                                        userPokemon = "Bulbasaur";
                                        break;
                                    case 3:
                                        userPokemon = "Turtwig";
                                        break;
                                    case 4:
                                        userPokemon = "Totodile";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou may get upset a little easily and feel uneasy when you don't fit in.\n" +
                                        "\n" +
                                        "But it's your delicate heart that lets you better understand others' feelings.\n" +
                                        "\n" +
                                        "With that sensitive personality, you must be..."+userPokemon+"!");
                            }
                            if (!sunny && calm && !flexible && !cooperate) {
                                out.println("Spring, summer, fall, or winter... Which season do you like best?\n\n"+
                                        "1) Spring, the season of buds and blooms!\n" +
                                        "2) Summer, the time for sea and sand!\n" +
                                        "3) Fall, when crickets chirp and dusk comes early.\n" +
                                        "4) Winter, when a blanket of snow covers all.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Chikorita";
                                        break;
                                    case 2:
                                        userPokemon = "Bulbasaur";
                                        break;
                                    case 3:
                                        userPokemon = "Turtwig";
                                        break;
                                    case 4:
                                        userPokemon = "Totodile";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're sure of yourself and unflappable. You have all the qualities of a leader.\n" +
                                        "\n" +
                                        "Just by being around you, others feel more confident.\n" +
                                        "\n" +
                                        "That charismatic personality must belong to..."+userPokemon+"!");
                            }
                            if (!sunny && calm && !flexible && cooperate) {
                                out.println("Spring, summer, fall, or winter... Which season do you like best?\n\n"+
                                        "1) Spring, the season of buds and blooms!\n" +
                                        "2) Summer, the time for sea and sand!\n" +
                                        "3) Fall, when crickets chirp and dusk comes early.\n" +
                                        "4) Winter, when a blanket of snow covers all.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Chikorita";
                                        break;
                                    case 2:
                                        userPokemon = "Bulbasaur";
                                        break;
                                    case 3:
                                        userPokemon = "Turtwig";
                                        break;
                                    case 4:
                                        userPokemon = "Totodile";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nSome people work hard in the background. You're one of those, aren't you?\n" +
                                        "\n" +
                                        "When you're not around, things don't go well. Everyone can always count on you.\n" +
                                        "\n" +
                                        "Someone who pulls the strings in the background like that must be..."+userPokemon+"!");
                            }
                            if (!sunny && calm && flexible && !cooperate) {
                                out.println("A wizard appears before you! He says he'll transform you into anything!" +
                                        "\n" +
                                        "What would you want to be?\n\n"+
                                        "1) A cute little critter, beloved by all!\n" +
                                        "2) A cold-blooded reptile with strength.\n" +
                                        "3) A freewheeling bird that wings across the sky!\n" +
                                        "4) A wild beast that is one with nature.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Pikachu";
                                        break;
                                    case 2:
                                        userPokemon = "Charmander";
                                        break;
                                    case 3:
                                        userPokemon = "Torchic";
                                        break;
                                    case 4:
                                        userPokemon = "Riolu";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou love tackling new challenges with your calm, cool, collected reasoning.\n" +
                                        "\n" +
                                        "You're so smart, you know the answers before you've even heard the question.\n" +
                                        "\n" +
                                        "That calm, reliable personality must belong to..."+userPokemon+"!");
                            }
                            if (!sunny && calm && flexible && !serious && cooperate) {
                                out.println("You've been given a piece of blank drawing paper!\n" +
                                        "\n" +
                                        "You're asked to draw a picture of the ocean. What color do you make it?\n\n"+
                                        "1) Brilliant green with tropical corals.\n" +
                                        "2) Bright blue with crystal-clear water.\n" +
                                        "3) Glimmering orange to reflect the sunset.\n" +
                                        "4) Rich cobalt blue to show great depth.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Cyndaquil";
                                        break;
                                    case 2:
                                        userPokemon = "Squirtle";
                                        break;
                                    case 3:
                                        userPokemon = "Tepig";
                                        break;
                                    case 4:
                                        userPokemon = "Mudkip";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou know your place and don't overdo things, but you're really motivated.\n" +
                                        "\n" +
                                        "Everyone looks to you as an example. You may have many admirers...\n" +
                                        "\n" +
                                        "That serene, lovely personality must belong to..."+userPokemon+"!");
                            }
                            if (!sunny && calm && flexible && serious && cooperate) {
                                out.println("You've been given a piece of blank drawing paper!\n" +
                                        "\n" +
                                        "You're asked to draw a picture of the ocean. What color do you make it?\n\n"+
                                        "1) Brilliant green with tropical corals.\n" +
                                        "2) Bright blue with crystal-clear water.\n" +
                                        "3) Glimmering orange to reflect the sunset.\n" +
                                        "4) Rich cobalt blue to show great depth.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Cyndaquil";
                                        break;
                                    case 2:
                                        userPokemon = "Squirtle";
                                        break;
                                    case 3:
                                        userPokemon = "Tepig";
                                        break;
                                    case 4:
                                        userPokemon = "Mudkip";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're never shaken and can always read between the lines. You never give up.\n" +
                                        "\n" +
                                        "You're quite likable, and you're always surrounded by friends.\n" +
                                        "\n" +
                                        "With a good-natured personality like that, you must be..."+userPokemon+"!");
                            }
                            if (sunny && !calm && !flexible && !serious) {
                                out.println("All right! It's snack time!\n" +
                                        "\n" +
                                        "And today we've got...cake! Woo-hoo! What kind of cake do you pick?\n\n"+
                                        "1) Simple-but-sweet strawberry shortcake.\n" +
                                        "2) Rich and creamy cheesecake.\n" +
                                        "3) Measured and mature green-tea mousse.\n" +
                                        "4) Classic chestnut-cream confection.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Oshawott";
                                        break;
                                    case 2:
                                        userPokemon = "Fennekin";
                                        break;
                                    case 3:
                                        userPokemon = "Snivy";
                                        break;
                                    case 4:
                                        userPokemon = "Chespin";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're very active, maybe too much so.\n" +
                                        "You may tire others out.\n" +
                                        "\n" +
                                        "But you are amazing.\n" +
                                        "You make the most of your time, after all!\n" +
                                        "\n" +
                                        "Being a wee bit impatient, you must be..."+userPokemon+"!");
                            }
                            if (sunny && !calm && !flexible && serious) {
                                out.println("All right! It's snack time!\n" +
                                        "\n" +
                                        "And today we've got...cake! Woo-hoo! What kind of cake do you pick?\n\n"+
                                        "1) Simple-but-sweet strawberry shortcake.\n" +
                                        "2) Rich and creamy cheesecake.\n" +
                                        "3) Measured and mature green-tea mousse.\n" +
                                        "4) Classic chestnut-cream confection.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Oshawott";
                                        break;
                                    case 2:
                                        userPokemon = "Fennekin";
                                        break;
                                    case 3:
                                        userPokemon = "Snivy";
                                        break;
                                    case 4:
                                        userPokemon = "Chespin";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou might be a bit of a space cadet, but when it's time to work, you work hard.\n" +
                                        "\n" +
                                        "You inspire courage in others without even knowing it.\n" +
                                        "\n" +
                                        "With that hardworking personality, you must be..."+userPokemon+"!");
                            }
                            if (sunny && !calm && flexible && !serious) {
                                out.println("We're going to the beach! Best. Day. Ever." +
                                        "\n" +
                                        "Time to kick back and enjoy the breeze. What view do you find yourself staring at?\n\n"+
                                        "1) The glittering blue stretch of sea.\n" +
                                        "2) The endless expanse of the sky.\n" +
                                        "3) The sandy shore being lapped by waves.\n" +
                                        "4) The gently swaying strands of dune grass.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Piplup";
                                        break;
                                    case 2:
                                        userPokemon = "Froakie";
                                        break;
                                    case 3:
                                        userPokemon = "Chimchar";
                                        break;
                                    case 4:
                                        userPokemon = "Treecko";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're a fearless challenger at all times! But you're also quick to give up.\n" +
                                        "\n" +
                                        "It's important to try out many different things to see what's right for you, though.\n" +
                                        "\n" +
                                        "As playful as you are, you must be..."+userPokemon+"!");
                            }
                            if (sunny && !calm && flexible && serious && !cooperate) {
                                out.println("A wizard appears before you! He says he'll transform you into anything!" +
                                        "\n" +
                                        "What would you want to be?\n\n"+
                                        "1) A cute little critter, beloved by all!\n" +
                                        "2) A cold-blooded reptile with strength.\n" +
                                        "3) A freewheeling bird that wings across the sky!\n" +
                                        "4) A wild beast that is one with nature.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Pikachu";
                                        break;
                                    case 2:
                                        userPokemon = "Charmander";
                                        break;
                                    case 3:
                                        userPokemon = "Torchic";
                                        break;
                                    case 4:
                                        userPokemon = "Riolu";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou carry yourself with thunderous authority. You're brave enough to speak your mind.\n" +
                                        "\n" +
                                        "You can do anything well, so others rely on you.\n" +
                                        "\n" +
                                        "As brave as you are, you must be..."+userPokemon+"!");
                            }
                            if (sunny && !calm && flexible && serious && cooperate) {
                                out.println("A wizard appears before you! He says he'll transform you into anything!" +
                                        "\n" +
                                        "What would you want to be?\n\n"+
                                        "1) A cute little critter, beloved by all!\n" +
                                        "2) A cold-blooded reptile with strength.\n" +
                                        "3) A freewheeling bird that wings across the sky!\n" +
                                        "4) A wild beast that is one with nature.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Pikachu";
                                        break;
                                    case 2:
                                        userPokemon = "Charmander";
                                        break;
                                    case 3:
                                        userPokemon = "Torchic";
                                        break;
                                    case 4:
                                        userPokemon = "Riolu";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're good natured and easygoing. But don't you feel nervous sometimes?\n" +
                                        "\n" +
                                        "That unique personality sets those around you at ease.\n" +
                                        "\n" +
                                        "As good natured as you are, you must be..."+userPokemon+"!");
                            }
                            if (sunny && calm && !flexible && !serious && !cooperate) {
                                out.println("We're going to the beach! Best. Day. Ever." +
                                        "\n" +
                                        "Time to kick back and enjoy the breeze. What view do you find yourself staring at?\n\n"+
                                        "1) The glittering blue stretch of sea.\n" +
                                        "2) The endless expanse of the sky.\n" +
                                        "3) The sandy shore being lapped by waves.\n" +
                                        "4) The gently swaying strands of dune grass.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Piplup";
                                        break;
                                    case 2:
                                        userPokemon = "Froakie";
                                        break;
                                    case 3:
                                        userPokemon = "Chimchar";
                                        break;
                                    case 4:
                                        userPokemon = "Treecko";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou are you. Others are others. You stay true to what you want to do.\n" +
                                        "\n" +
                                        "Your actions make everyone feel all right. They all envy you.\n" +
                                        "\n" +
                                        "With that ability to make others happy, you must be..."+userPokemon+"!");
                            }
                            if (sunny && calm && !flexible && cooperate) {
                                out.println("You've been given a piece of blank drawing paper!\n" +
                                        "\n" +
                                        "You're asked to draw a picture of the ocean. What color do you make it?\n\n"+
                                        "1) Brilliant green with tropical corals.\n" +
                                        "2) Bright blue with crystal-clear water.\n" +
                                        "3) Glimmering orange to reflect the sunset.\n" +
                                        "4) Rich cobalt blue to show great depth.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Cyndaquil";
                                        break;
                                    case 2:
                                        userPokemon = "Squirtle";
                                        break;
                                    case 3:
                                        userPokemon = "Tepig";
                                        break;
                                    case 4:
                                        userPokemon = "Mudkip";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nYou're friendly and open minded. Aren't you already happy just as you are?\n" +
                                        "\n" +
                                        "You're so calm for your age... When you're happy, everyone is happy.\n" +
                                        "\n" +
                                        "As mild mannered as you are, you must be..."+userPokemon+"!");
                            }
                            if (sunny && calm && serious && !cooperate) {
                                out.println("All right! It's snack time!\n" +
                                        "\n" +
                                        "And today we've got...cake! Woo-hoo! What kind of cake do you pick?\n\n"+
                                        "1) Simple-but-sweet strawberry shortcake.\n" +
                                        "2) Rich and creamy cheesecake.\n" +
                                        "3) Measured and mature green-tea mousse.\n" +
                                        "4) Classic chestnut-cream confection.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Oshawott";
                                        break;
                                    case 2:
                                        userPokemon = "Fennekin";
                                        break;
                                    case 3:
                                        userPokemon = "Snivy";
                                        break;
                                    case 4:
                                        userPokemon = "Chespin";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nEveryone believes you're indecisive, but you actually just think before you act.\n" +
                                        "\n" +
                                        "Your positivity wins people over. It's no surprise you're so successful!\n" +
                                        "\n" +
                                        "With your ability to make everyone feel jolly, you must be..."+userPokemon+"!");
                            }
                            if (sunny && calm && flexible && !serious && !cooperate) {
                                out.println("All right! It's snack time!\n" +
                                        "\n" +
                                        "And today we've got...cake! Woo-hoo! What kind of cake do you pick?\n\n"+
                                        "1) Simple-but-sweet strawberry shortcake.\n" +
                                        "2) Rich and creamy cheesecake.\n" +
                                        "3) Measured and mature green-tea mousse.\n" +
                                        "4) Classic chestnut-cream confection.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Oshawott";
                                        break;
                                    case 2:
                                        userPokemon = "Fennekin";
                                        break;
                                    case 3:
                                        userPokemon = "Snivy";
                                        break;
                                    case 4:
                                        userPokemon = "Chespin";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nEveryone looks up to you. You're persuasive and get what you want.\n" +
                                        "\n" +
                                        "To those around you, your clever actions look really cool.\n" +
                                        "\n" +
                                        "As cool as you are, you must be..."+userPokemon+"!");
                            }
                            if (sunny && calm && flexible && cooperate) {
                                out.println("You've been given a piece of blank drawing paper!\n" +
                                        "\n" +
                                        "You're asked to draw a picture of the ocean. What color do you make it?\n\n"+
                                        "1) Brilliant green with tropical corals.\n" +
                                        "2) Bright blue with crystal-clear water.\n" +
                                        "3) Glimmering orange to reflect the sunset.\n" +
                                        "4) Rich cobalt blue to show great depth.");
                                out.print("\nEnter 1 or 2: ");
                                ans = input.nextInt();
                                switch (ans) {
                                    case 1:
                                        userPokemon = "Cyndaquil";
                                        break;
                                    case 2:
                                        userPokemon = "Squirtle";
                                        break;
                                    case 3:
                                        userPokemon = "Tepig";
                                        break;
                                    case 4:
                                        userPokemon = "Mudkip";
                                        break;
                                    default:
                                        out.println("Please enter 1, 2, 3, or 4.");
                                }
                                out.println("\nWho's got time to worry? You're a genius at having fun!\n" +
                                        "\n" +
                                        "Your cheerfulness makes everyone smile. Every day is a happy day when you're around!\n" +
                                        "\n" +
                                        "With your ability to produce warm, fuzzy feelings all around you, you must be..."+userPokemon+"!");
                            }
                        }
                        else {
                            out.println("\nPlease enter 1 or 2.");
                        }
                    }
                    else {
                        out.println("\nPlease enter 1 or 2.");
                    }
                }
                else {
                    out.println("\nPlease enter 1 or 2.");
                }
            }
            else {
                out.println("\nPlease enter 1 or 2.");
            }
        }
        else {
            out.println("\nPlease enter 1 or 2.");
        }
    }
}
