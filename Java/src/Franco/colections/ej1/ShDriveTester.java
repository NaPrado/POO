package Franco.colections.ej1;

public class ShDriveTester {
    public static void main(String[] args) {
        SharedDrive drive = new SharedDrive();

        drive.addFile("mineSweeper.c", "PI").addFile("r2.doc", "PI")
                .addFile("r1.doc", "PI").addFile("r2.doc", "POO").addFile("r1.doc", "PI");

        for(SharedDrive.SharedFile sharedFile : drive.getAllFiles()) {
            System.out.println(sharedFile);
        }
        //File mineSweeper.c in work area PI
        //File r2.doc in work area PI
        //File r1.doc in work area PI
        //File r2.doc in work area POO
        //File r1.doc in work area PI

        System.out.println(drive.getFirstFile(
                sF -> sF.getFileName().equals("r2.doc")));
        // File r2.doc in work area PI

        System.out.println(drive.getLastFile());
        // File r1.doc in work area PI
    }
}
