import java.util.ArrayList;
import java.util.List;

public class MasterTraining {

    private List<Plan> plans;

    public MasterTraining() {this.plans= new ArrayList<>();}

    /**
     * Determina para un plan especifico el rendimiento del corazon del ciclista.
     * Si el corazon presenta latidos  irregulares, crea un nuevo plan de tipo "Heart care" para dicho ciclista.
     *
     *DOCUMENTACION INVARIANTE
     *
     * @param number El numero del plan a verificar.
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     *
     */

    public Plan checkHeart (long number) {

        Plan p = findPlan(number);

        double pab = p.averageBeats();
        return null;
    }


    /**
     * Encuentra un plan dado su id.
     * Si el plan no existe retorna null
     * @param
     * @return
     */
    private Plan findPlan(long number) {
        Plan result = null;

        for(int i=0;i<this.plans.size();i++) {
            if(this.plans.get(i).getNumber() == number)
                result = this.plans.get(i);
        }

        return result;
    }

    public void addPlan(Plan plan) {
        this.plans.add(plan);
    }

    public int countPlans() {return this.plans.size();}
}
