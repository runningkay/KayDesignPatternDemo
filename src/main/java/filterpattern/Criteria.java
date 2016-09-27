package filterpattern;

import java.util.List;

/**
 * Created by Nozomi on 2016/9/27.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
