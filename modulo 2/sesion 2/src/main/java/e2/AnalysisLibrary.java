package e2;

public class AnalysisLibrary {
    public void analyzeInformation(String json) throws  Exception{
        if(!validateJson(json)){
            throw new Exception("La informacion no tiene formato json");
        }
        System.out.println("Procesando la información");
    }

    public boolean validateJson(String data){
        return true;
    }
}
