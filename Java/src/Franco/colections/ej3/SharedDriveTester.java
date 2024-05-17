package Franco.colections.ej3;

public class SharedDriveTester {

    public static void main(String[] args) {
        SharedDrive drive = new SharedDrive();

        drive.addFile("mineSweeper.c", "PI").addFile("r2.doc", "PI")
                .addFile("r1.doc", "PI").addFile("r2.doc", "POO").addFile("r1.doc", "PI");

        for(SharedDrive.SharedFile sF : drive.getAllFiles()) {
            System.out.println(sF);
        }
        //File mineSweeper.c in work area PI
        //File r1.doc in work area PI
        //File r2.doc in work area PI
        //File r2.doc in work area POO
        System.out.println("#####");

        for(SharedDrive.SharedFile sF : drive.getAllFilesReversed()) {
            System.out.println(sF);
        }
        //File r2.doc in work area POO
        //File r2.doc in work area PI
        //File r1.doc in work area PI
        //File mineSweeper.c in work area PI
    }

}
