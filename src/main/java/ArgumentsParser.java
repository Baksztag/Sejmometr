/**
 * Created by jakub.a.kret@gmail.com on 2017-01-26.
 */
public class ArgumentsParser {
    private String name;
    private int termOfOffice;
    private boolean download;


    public ArgumentsParser(String[] args) throws IllegalArgumentException {
        String message = "Valid input format: 'termOfOffice [-d] [name]' Where:\n" +
                "termOfOffice = 7 or 8\n" +
                "-d updates data\n" +
                "deputy name is optional";
        if (args.length == 0) {
            throw new IllegalArgumentException("Too few arguments given");
        }

        try {
            this.termOfOffice = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(message);
        }

        if (this.termOfOffice != 7 && this.termOfOffice != 8) {
            throw new IllegalArgumentException(message);
        }

        name = "";
        if (args.length > 1) {
            int j = 1;
            this.download = false;
            if (args[1].equals("-d")) {
                this.download = true;
                j = 2;
            }

            if (args.length > j) {
                for (int i = j; i < args.length; i++) {
                    name = name + args[i] + " ";
                }
                name = name.substring(0, name.length() - 1);
            }
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTermOfOffice() {
        return termOfOffice;
    }

    public boolean download() {
        return download;
    }
}
