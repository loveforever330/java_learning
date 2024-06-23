import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

import java.util.EventListener;
import java.util.Observable;
import java.util.Random;

public class gui extends Application {
    //下面的将会用于组件框
    private ComboBox<String> cbo_min = new ComboBox<>();
    //组件框
    private ComboBox<String> cbo_max = new ComboBox<>();

    private String[] num_min = new String[10000];

    private String[] num_max = new String[10000];

    private Arithmetic number_min = new Arithmetic();

    private String show_result_on_text;

    private Random random = new Random();
    private Arithmetic number_max = new Arithmetic();

    private TextField show_result_value = new TextField();
    private TextField user_answer = new TextField();


    @Override
    public void start(Stage primaryStage) throws Exception {


        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(10);
        pane.setVgap(40);
        //上面的用于画出每个控件之间的距离，以及每个控件之间的距离

        //下列是用于列表的组件库的对象
        for (int i = 1; i < 10000; i++) {
            num_max[i] = String.valueOf(i);
            num_min[i] = String.valueOf(i);
        }
        //这里的是将数组中的放入其中
        ObservableList<String> num_min_items = FXCollections.observableArrayList(num_min);
        cbo_min.getItems().addAll(num_min_items);

        //这里也是将对应的数组放入
        ObservableList<String> num_max_items = FXCollections.observableArrayList(num_max);
        cbo_max.getItems().addAll(num_max_items);


        pane.getChildren().addAll(new Label("请选择操作数的最小值： "), cbo_min,
                new Label("请选择操作数的最大值： "), cbo_max,
                new Label("选择生成的计算方法内容："));

        //调用值

        cbo_max.setOnAction(e -> cbo_max.getValue());//这里是传入值到功能类里
        cbo_min.setOnAction(e -> cbo_min.getValue());//这里也是将值传入到功能类里


        //下面的是复选框按钮
        RadioButton rb_plus = new RadioButton("+");
        RadioButton rb_minus = new RadioButton("-");
        RadioButton rb_multiply = new RadioButton("*");
        RadioButton rb_divide = new RadioButton("/");


        //这里用于设置对应的组和每一个复选框按钮
        ToggleGroup group = new ToggleGroup();
        rb_plus.setToggleGroup(group);
        rb_minus.setToggleGroup(group);
        rb_multiply.setToggleGroup(group);
        rb_divide.setToggleGroup(group);

        rb_plus.setOnAction(e -> {
            if (rb_plus.isSelected()) {
                Arithmetic.operator = "+";
            }
        });
        rb_minus.setOnAction(e -> {
            if (rb_minus.isSelected()) {
                Arithmetic.operator = "-";
            }
        });
        rb_multiply.setOnAction(e -> {
            Arithmetic.operator = "*";

        });
        rb_divide.setOnAction(e -> {
            Arithmetic.operator = "/";
        });


        //下面的是选择框位置;
        HBox paneforRadioButtons = new HBox(100);
        paneforRadioButtons.getChildren().addAll(rb_plus, rb_minus, rb_multiply, rb_divide);
        pane.getChildren().add(paneforRadioButtons);

        //后面的答案位置
        Button show_result = new Button("生成新算式");
        ShowResultClass show_Result = new ShowResultClass();
        show_result.setOnAction(show_Result);


        Button judge_result = new Button("判定");
        JudgeResultClass judge_Result = new JudgeResultClass();
        judge_result.setOnAction(judge_Result);


        Button answer_result = new Button("答案");
        AnswResultClass answer_Result = new AnswResultClass();
        answer_result.setOnAction(answer_Result);


        show_result_value.setEditable(false);
        show_result_value.setPrefColumnCount(10);

        pane.getChildren().addAll(show_result, show_result_value);

        //用户输入的内容
        user_answer.setPrefColumnCount(10);
        pane.getChildren().addAll(new Label("你的答案"), user_answer, judge_result, answer_result);

        Scene scene = new Scene(pane, 600, 200);
        primaryStage.setTitle("四则运算出题软件");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class ShowResultClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent f) {
            number_max.initnumber(Integer.valueOf(cbo_max.getValue()));
            number_min.initnumber(Integer.valueOf(cbo_min.getValue()));
            Arithmetic.bool_capable_of_caculate(number_min.number, number_max.number);//比较大小
            number_max.initnumber((random.nextInt(number_min.number + 1) + (number_max.number - number_min.number)));//确定对应的随机值
            number_min.initnumber((random.nextInt(number_min.number + 1) + (number_max.number - number_min.number)));
            Arithmetic.result = Arithmetic.judge_show(number_min.number, number_max.number, Arithmetic.operator, Arithmetic.result);
            show_result_on_text = Arithmetic.show_caculate_process(number_min.number, number_max.number, Arithmetic.operator);
            //下面是将结果显示出来
            show_result_value.setText(String.format(show_result_on_text));
        }
    }

    class JudgeResultClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent f) {
            //下面用一个函数判断即可
            if (Arithmetic.compare_numbers(Arithmetic.result, Integer.parseInt(user_answer.getText()))) {
                Stage stage=new Stage();
                stage.setTitle("判定结果");
                stage.setScene(new Scene(new Label("      恭喜，答案正确"),200,150));
                stage.show();
            }
            else{
                Stage stage=new Stage();
                stage.setTitle("判定结果");
                stage.setScene(new Scene(new Label("       请检查你的答案"),200,150));
                stage.show();
            }
        }
    }

    class AnswResultClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent f) {
            Stage stage=new Stage();
            stage.setTitle("答案结果");
            stage.setScene(new Scene(new Label("答案为: "+show_result_on_text + Arithmetic.result),200,150));
            stage.show();
        }
    }

}
