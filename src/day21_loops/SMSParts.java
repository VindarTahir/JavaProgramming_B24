package day21_loops;

public class SMSParts {

    public static void main(String[] args) {

        /*
            [SMS parts] Given a String in the following format:“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love                  programming and problem solving}” Separate these parts and print them separately: Sender: actualSenderNumber:                               actualNumberMessage: actualMessage”

             1) We need to find the all the indexes
                    - sender find the index of < and >
                    - number find the index of the [ and ]
                    - message find the index of the { and }

             2) with our indexes we can now pull from the String with substring

         */

        String msg = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";

        int indexOfSenderBegin = msg.indexOf("<");
        int indexOfSenderClosing = msg.indexOf(">");

        int indexOfNumberBegin = msg.indexOf("[");
        int indexOfNumberClosing = msg.indexOf("]");

        int indexOfMessageBegin = msg.indexOf("{");
        int indexOfMessageClosing = msg.indexOf("}");

        String sender = msg.substring(indexOfSenderBegin + 1,indexOfSenderClosing );

        String number = msg.substring(indexOfNumberBegin + 1, indexOfNumberClosing );

        String message = msg.substring(indexOfMessageBegin + 1, indexOfMessageClosing );

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

    }
}
