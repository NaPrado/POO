package Franco.colections.ej4;

public class SharedDriveTester {

    public static void main(String[] args) {
        SharedDrive drive = new SharedDrive();

        drive.addFile("mineSweeper.c", "PI").addFile("r2.doc", "PI")
                .addFile("r1.doc", "PI").addFile("r2.doc", "POO").addFile("r1.doc", "PI");

        for(SharedDrive.SharedFile sF : drive.getWorkAreaFiles("PI")) {
            System.out.println(sF);
        }
        //File mineSweeper.c in work area PI
        //File r1.doc in work area PI
        //File r2.doc in work area PI
        System.out.println("#####");

        for(SharedDrive.SharedFile sF : drive.getWorkAreaFiles("POO")) {
            System.out.println(sF);
        }
        //File r2.doc in work area POO
        System.out.println("#####");

        for (String wA : drive.getWorkAreas()) {
            System.out.println(wA);
        }
        // POO
        // PI
        System.out.println("#####");

        System.out.println(drive.filesCount("PI")); // 3
        System.out.println(drive.filesCount("POO")); // 1
    }

}
