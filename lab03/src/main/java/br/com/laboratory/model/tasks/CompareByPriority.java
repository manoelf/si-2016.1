package br.com.laboratory.model.tasks;

import java.util.Comparator;

/**
 * Created by manoelferreira on 2/8/17.
 */
public class CompareByPriority implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        RealTask firstTask = (RealTask)o1;
        RealTask secondTask = (RealTask)o2;
        if (firstTask.getPriority().ordinal() > secondTask.getPriority().ordinal()) {
            return 1;
        } else if (firstTask.getPriority().ordinal() < secondTask.getPriority().ordinal()) {
            return -1;
        } else {
            return 0;
        }
    }
}
