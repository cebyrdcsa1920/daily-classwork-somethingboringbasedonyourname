import java.util.Scanner;

public class ScannerPractice
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("This is just a practice game with no real literary or entertainment value. I'm just screwing around with coding, but maybe I can do something fun with this eventually! So yeah. It works pretty simply. You just type whatever the prompt asks. If there are multiple options, type whatever the option is word for word. Yep! With that out of the way, let's begin!");
        System.out.println("");
        System.out.println("You wake up to find yourself sitting on a bed in a messy, vine-ridden cottage. Warm soup sits on a table close by, next to a glass of milk. You see herbs strewn about a table across from your bed, alongside glowing viles and colorful elixirs. The cottage only has one room, but it isn't too cramped. You don't know where you are or how you got here, but you know that you've never been here before. You sit up and are immediatley greeted by a small, fairy like creature.");
        System.out.println("");
        System.out.println("Sprite: Hiya! I'm Maybell! You don't know where you are, do you? I'll explain, but first... May I have your name?");
        System.out.println("");
        String name = keyboard.nextLine();
        System.out.println("");
        System.out.println( "Sprite: " + name + " ... what a cool name! What's your favorite color?");
        System.out.println("");
        String color = keyboard.nextLine();
        System.out.println("");
        System.out.println("Sprite: Hey, no way! My favorite color is " + color +" too! I like you already. Oh, what's your favorite thing to do?");
        System.out.println("");
        String hobby = keyboard.nextLine();
        System.out.println("");
        System.out.println("Sprite: That's super neat! I actually had an aunt into that... she was a little wild. I used to practice it with her on the weekends. We actually have a lot in common! Oh, I almost forgot! I was supposed to ask why you were here! I swear I'd lose my head if it wasn't screwed on. Do you mind telling me what brings you here?");
        System.out.println("");
        System.out.println("I don't know/ What's it to you?");
        System.out.println("");
        String purpose = keyboard.nextLine();

                System.out.println("Sprite: Oh.. well, that's not good. I promised the chief I'd figure out what the heck a human was doing here! I guess we'll have to figure something out then. I'll take you to see the chief! He asked for you anyways.");
                System.out.println("");


            if(purpose.equals("What's it to you?"))

            {
               System.out.println("");
                System.out.println("Sprite: Hmph, no need to be snooty! If you won't tell me then I can't help you.");
                System.out.println("");
                System.out.println("");
                System.out.println("Ask for help?" + "     Yes / No");
                System.out.println("");
                String help = keyboard.nextLine();
            if (help.equals("Yes"))
            {
                System.out.println("Sprite: Help? Sure thing! I'll take you to the village! That was the plan, anyways. Chief wanted a word with you himself.");
                System.out.println("");
            }
            else if(help.equals("No"))
            {
                System.out.println("");
                System.out.println("Sprite: I mean, if you don't want any help, I could just leave you here. I don't need to help you. I'll give you one last chance to accept my help.");
                 System.out.println("");
                 System.out.println("Accept Maybell's help?" + "    Yes / No");
                 System.out.println("");

                String helptwo = keyboard.nextLine();
                    if (helptwo.equals("Yes"))
                    {
                        System.out.println("");
                        System.out.println("Sprite: Alright... you were really close to losing there, bucko. Be nice to me form now on, alright? I just want to help you.");
                        System.out.println("");
                    }
                    else if(helptwo.equals("No"))
                    {
                        System.out.println("");
                        System.out.println("Sprite: Alright then. You can just stay here and fend for yourself... Goodluck, " + name + ".");
                        System.out.println("");
                        System.out.println("With Maybell gone, you sit in the cottage for a few hours before deciding what course of action to take. You realize you're hungry and thirsty. You attepmt to hunt, but don't find any prey, or a river for that matter. Not knowing what else to do, you try and find the cabin, but to no avail. You survive for two days before your body is gruesomely ravagaved by a pack of hungry wolves who find you weak and helpless. Game over.");
                    }


            }


           }

           System.out.println("Alrighty then! Get up so we can go to the village! The chief is very old and very wise, you need to look presentable!");
        System.out.println("");
        System.out.println("Ready to leave, you sit up in bed, only to realize you're naked. Naked!? Did this perverted miniature gremlin strip you of your clothes? You shoot her a puzzled, embarassed look.");
        System.out.println("Sprite: Ah, yeah... your clothes were a bit dirty, so I decided to wash them! Do all humans not bathe? Anyways, let me find you some more clothes. I tried washing yours and... well... apparently fairy detergent doesn't work so well on human clothes. Who knew, right?");
        System.out.println("");
        System.out.println("Maybell sifts through her closet to find something for you to wear. For some odd reason, she actually has one " + color + "human sized tunic and a pair of worn, leather human boots.");
        System.out.println("");
        System.out.println("Sprite: I keep clothes for most creatures in case one gets hurt. Incase you couldn't tell by my supplies, I'm a medicinal sprite! I take care of wounded creatures, all shapes and sizes. I must say though, I'm surprised I still have human clothes. It feels like a millenia since I last heard about a human in these parts, much less saw one! I'll fly out while you put these on, alright? Then we'll get going!");
        System.out.println("");
        System.out.println("Maybell tosses you the clothes and you wait for her to leave before you put them on. Sure enough, they're a perfect fit! The " + color + " goes well with your complexion. Would you like to leave now or stay?");
        System.out.println("");
        System.out.println("Leave  /  Stay");
        System.out.println("");
        String begpath = keyboard.nextLine();
        System.out.println("");
            if (begpath.equals("Stay"))
            {
                System.out.println("");
                System.out.println("There isn't much to do in here. Although, you have been eyeing those weird potions since you first came too... try one?");
                System.out.println("");
                System.out.println("Yes  /  No");
                System.out.println("");
                String strangepotions = keyboard.nextLine ();
                if (strangepotions.equals("Yes"))
               {
                   System.out.println("");

                System.out.println ("You pick up a glowing potion and drink it. You immediatley drop to the floor and begin writhing helplessly as the world fades to black. Man, if this fariy is supposed to heal people then what just happened? Talk about irnoy. What did you expect, a pair of wings? Game over.");
                keyboard.close();
               }
               else if (strangepotions.equals("No"))
            {
                System.out.println("You decide the potions may not be a good idea and decide to leave them be.");
            }


                 System.out.println("You decide you shouldn't keep Maybell waiting. You walk out the door, and your adventure begings");
    }
       }
}

