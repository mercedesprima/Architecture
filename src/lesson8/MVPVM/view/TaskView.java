package lesson8.MVPVM.view;

import lesson8.MVPVM.viewModel.TaskViewModel;

import java.util.List;

public interface TaskView {
    void showTasks(List<TaskViewModel> taskViewModels);
}
