package filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nozomi on 2016/9/27.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons){
        List<Person> malePersons=new ArrayList<Person>();

        for(Person person:persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
