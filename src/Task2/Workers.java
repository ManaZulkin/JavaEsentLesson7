package Task2;

public class Workers {
    String workerName, workerPosition;
    int startYear;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }



    public Workers(String workerName, String workerPosition, int startYear){
        this.startYear = startYear;
        this.workerName = workerName;
        this.workerPosition = workerPosition;
    }

    public static void CheckYear(Workers worker){
        Exception ex = new Exception("Wrong year or wrong year format");
        try{

            if (worker.startYear > 2023 || 2000 > worker.startYear )
                throw ex;
        }
        catch (Exception e){
            System.out.println(worker.workerName + " " + e.getMessage());
        }
    }
    public static void CheckExp(Workers workers, int exp){
        if ((2023 - workers.startYear) > exp && (2023 - workers.startYear) > 0 )
            System.out.println(workers.workerName + " " + workers.workerPosition);
    }

}
