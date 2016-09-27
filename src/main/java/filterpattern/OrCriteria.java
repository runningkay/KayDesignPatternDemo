package filterpattern;

import java.util.List;

/**
 * Created by Nozomi on 2016/9/27.
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCirteria;

    public OrCriteria(Criteria criteria, Criteria otherCirteria) {
        this.criteria = criteria;
        this.otherCirteria = otherCirteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCirteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
