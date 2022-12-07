package com.example.quizzapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionList> dialyQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Than đá thuộc loại đá nào?", "Trầm tích", "Hoá thạch", "Hoa cương", "Sa Thạch", "Trầm tích", "");
        final QuestionList question2 = new QuestionList("Những ngọn cát được hình thành bởi gió có tên gọi là gì?", "Đùn cát", "Cồn cát", "Thác cát", "Khẩu cát", "Cồn cát", "");
        final QuestionList question3 = new QuestionList("Loại bão nào có hình dạng giống cái phễu và có sức tàn phá khủng khiếp khi nó chạm xuống mặt đất?", "Tố", "Dông", "Vòi rồng", "Lốc xoáy", "Lốc xoáy", "");
        final QuestionList question4 = new QuestionList("Thang đo Saffir-Simpson được dùng để đo lường điều gì?", "Đo cường độ sức gió của bão", "Đo tốc độ di chuyển của bão", "Đo độ rộng của bão", "Đo gia tốc của bão", "Đo cường độ sức gió của bão", "");
        final QuestionList question5 = new QuestionList("Tên của vùng rìa ngập nước của một lục địa là gì?", "Vỏ lục địa", "Rìa lục địa", "Dốc lục địa", "Thềm lục địa", "Thềm lục địa", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> dialyQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Nước ta nằm ở vị trí:", "Rìa phía đông bán đảo Đông Dương", "Trên bán đảo Trung Ấn", "Trung tâm Châu Á", "Ý a và b đúng","Ý a và b đúng", "");
        final QuestionList question2 = new QuestionList("Điểm cực Nam của nước ta thuộc tỉnh?", "Bạc Liêu", "Cà Mau", "Kiên Giang", "Sóc Trăng", "Kiên Giang", "");
        final QuestionList question3 = new QuestionList("Điểm cực Tây của nước ta thuộc tỉnh nào?", "Điện Biên", "Lai Châu", "Sơn La", "Lào Cai", "Điện Biên", "");
        final QuestionList question4 = new QuestionList("Trong các tỉnh (thành phố) sau, tỉnh (thành phố) nào không giáp biển?", "Cần Thơ", "TP Hồ Chí Minh", "Quảng Nam", "Nghệ An", "Cần Thơ", "");
        final QuestionList question5 = new QuestionList("Tên của vùng rìa ngập nước của một lục địa là gì?", "Vỏ lục địa", "Rìa lục địa", "Dốc lục địa", "Thềm lục địa", "Thềm lục địa", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }
    private static List<QuestionList> dialyQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Nằm ở rìa phía Đông của bán đảo Đông Dương là nước?", "Lào", "Campuchia", "Việt Nam", "Mi-an-ma", "Việt Nam", "");
        final QuestionList question2 = new QuestionList("Những ngọn cát được hình thành bởi gió có tên gọi là gì?", "Đùn cát", "Cồn cát", "Thác cát", "Khẩu cát", "Cồn cát", "");
        final QuestionList question3 = new QuestionList("Loại bão nào có hình dạng giống cái phễu và có sức tàn phá khủng khiếp khi nó chạm xuống mặt đất?", "Tố", "Dông", "Vòi rồng", "Lốc xoáy", "Lốc xoáy", "");
        final QuestionList question4 = new QuestionList("Thang đo Saffir-Simpson được dùng để đo lường điều gì?", "Đo cường độ sức gió của bão", "Đo tốc độ di chuyển của bão", "Đo độ rộng của bão", "Đo gia tốc của bão", "Đo cường độ sức gió của bão", "");
        final QuestionList question5 = new QuestionList("Tên của vùng rìa ngập nước của một lục địa là gì?", "Vỏ lục địa", "Rìa lục địa", "Dốc lục địa", "Thềm lục địa", "Thềm lục địa", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> hoahocQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Công thức hóa học của Axit sulfuric?", "H2O", "H2SO4", "H3SO4", "H2S", "H2SO4", "");
        final QuestionList question2 = new QuestionList("Trong nguyên tử, khối lượng của hạt nào không đáng kể so với các hạt còn lại?", "Neutron", " Proton và electron", "Proton", "Electron", "Electron", "");
        final QuestionList question3 = new QuestionList("Hạt nhân nguyên tử được cấu tạo bởi?", "Neutron và electron", "Proton và electron", "Proton và neutron", "Electron", "Proton và neutron", "");
        final QuestionList question4 = new QuestionList("Trong nguyên tử, hạt nào mang điện?", "Neutron và electron", "Proton và electron", "Electron", " Proton và neutron", "Proton và electron", "");
        final QuestionList question5 = new QuestionList("Hạt nào sau đây nằm ở lớp vỏ nguyên tử?", "Hạt neutron", "Hạt alpha", "Hạt electron", "Hạt proton", "Hạt alpha", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> hoahocQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("hất nào sau đây được coi là chất tinh khiết?", "Nước cất", "Nước suối", "Nước khoáng", "Nước đá từ nhà máy", "Nước cất", "");
        final QuestionList question2 = new QuestionList("Cho dãy các cụm từ sau, dãy nào dưới đây chỉ chất?", "Bàn ghế, đường kính, vải may áo", "Muối ăn, đường kính, bột sắt, nước cất", "Bút chì, thước kẻ, nước cất, vàng", "Nhôm, sắt, than củi, chảo gang", "Muối ăn, đường kính, bột sắt, nước cất", "");
        final QuestionList question3 = new QuestionList("Hạt nhân nguyên tử được cấu tạo bởi?", "Neutron và electron", "Proton và electron", "Proton và neutron", "Electron", "Proton và neutron", "");
        final QuestionList question4 = new QuestionList("Trong nguyên tử, hạt nào mang điện?", "Neutron và electron", "Proton và electron", "Electron", " Proton và neutron", "Proton và electron", "");
        final QuestionList question5 = new QuestionList("Hạt nào sau đây nằm ở lớp vỏ nguyên tử?", "Hạt neutron", "Hạt alpha", "Hạt electron", "Hạt proton", "Hạt alpha", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }
    private static List<QuestionList> hoahocQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Công thức hóa học của Axit sulfuric?", "H2O", "H2SO4", "H3SO4", "H2S", "H2SO4", "");
        final QuestionList question2 = new QuestionList("Trong nguyên tử, khối lượng của hạt nào không đáng kể so với các hạt còn lại?", "Neutron", " Proton và electron", "Proton", "Electron", "Electron", "");
        final QuestionList question3 = new QuestionList("Hạt nhân nguyên tử được cấu tạo bởi?", "Neutron và electron", "Proton và electron", "Proton và neutron", "Electron", "Proton và neutron", "");
        final QuestionList question4 = new QuestionList("Trong nguyên tử, hạt nào mang điện?", "Neutron và electron", "Proton và electron", "Electron", " Proton và neutron", "Proton và electron", "");
        final QuestionList question5 = new QuestionList("Hạt nào sau đây nằm ở lớp vỏ nguyên tử?", "Hạt neutron", "Hạt alpha", "Hạt electron", "Hạt proton", "Hạt alpha", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> vutruQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Chọn phát biểu sai về hệ Mặt Trời?", "Mặt Trời là thiên thể tự phát sáng", "Có 8 hành tinh lớn chuyển động quanh Mặt Trời", "Các hành tinh chuyển động quanh Mặt Trời theo cùng một chiều", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "");
        final QuestionList question2 = new QuestionList("Trái Đất có khí hậu 4 mùa là do?", "Trái Đất chuyển động quanh Mặt Trời theo quỹ đạo êlip", "Trái Đất có lúc ở xa, có lúc ở gần Mặt Trời", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "Cực từ của Trái Đất không trùng với cực địa lí của nó", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "");
        final QuestionList question3 = new QuestionList("Đơn vị thiên văn?", "là bán kính của hệ Mặt Trời", "là khoảng cách từ Trái Đất đến Mặt Trời", "là quãng đường ánh sáng đi được trong 1 năm", "bằng 1,5.10^8 m", "là khoảng cách từ Trái Đất đến Mặt Trời", "");
        final QuestionList question4 = new QuestionList("Việc các hành tinh quay xung quanh Mặt Trời theo cùng một chiều được giải thích là hệ quả của định luật?", "bảo toàn năng lượng", "bảo toàn khối lượng", "bảo toàn momen động lượng", "bảo toàn động lượng", "bảo toàn momen động lượng", "");
        final QuestionList question5 = new QuestionList("Các hành tinh trong hệ Mặt Trời không có tính chất chung nào nêu dưới đây?", "Đều có các quỹ đạo không giao nhau", "Đều có các vệ tinh quay xung quanh", "Đều quay quanh Mặt Trời theo cùng một chiều", "Đều không tự phát sáng", "Đều có các vệ tinh quay xung quanh", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> vutruQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Chọn phát biểu sai về hệ Mặt Trời?", "Mặt Trời là thiên thể tự phát sáng", "Có 8 hành tinh lớn chuyển động quanh Mặt Trời", "Các hành tinh chuyển động quanh Mặt Trời theo cùng một chiều", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "");
        final QuestionList question2 = new QuestionList("Trái Đất có khí hậu 4 mùa là do?", "Trái Đất chuyển động quanh Mặt Trời theo quỹ đạo êlip", "Trái Đất có lúc ở xa, có lúc ở gần Mặt Trời", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "Cực từ của Trái Đất không trùng với cực địa lí của nó", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "");
        final QuestionList question3 = new QuestionList("Đơn vị thiên văn?", "là bán kính của hệ Mặt Trời", "là khoảng cách từ Trái Đất đến Mặt Trời", "là quãng đường ánh sáng đi được trong 1 năm", "bằng 1,5.10^8 m", "là khoảng cách từ Trái Đất đến Mặt Trời", "");
        final QuestionList question4 = new QuestionList("Việc các hành tinh quay xung quanh Mặt Trời theo cùng một chiều được giải thích là hệ quả của định luật?", "bảo toàn năng lượng", "bảo toàn khối lượng", "bảo toàn momen động lượng", "bảo toàn động lượng", "bảo toàn momen động lượng", "");
        final QuestionList question5 = new QuestionList("Các hành tinh trong hệ Mặt Trời không có tính chất chung nào nêu dưới đây?", "Đều có các quỹ đạo không giao nhau", "Đều có các vệ tinh quay xung quanh", "Đều quay quanh Mặt Trời theo cùng một chiều", "Đều không tự phát sáng", "Đều có các vệ tinh quay xung quanh", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> vutruQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Chọn phát biểu sai về hệ Mặt Trời?", "Mặt Trời là thiên thể tự phát sáng", "Có 8 hành tinh lớn chuyển động quanh Mặt Trời", "Các hành tinh chuyển động quanh Mặt Trời theo cùng một chiều", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "Hải vương tinh là hành tinh nằm gần Mặt Trời nhất", "");
        final QuestionList question2 = new QuestionList("Trái Đất có khí hậu 4 mùa là do?", "Trái Đất chuyển động quanh Mặt Trời theo quỹ đạo êlip", "Trái Đất có lúc ở xa, có lúc ở gần Mặt Trời", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "Cực từ của Trái Đất không trùng với cực địa lí của nó", "Trục của Trái Đất nghiêng so với mặt phẳng quỹ đạo của nó quanh Mặt Trời", "");
        final QuestionList question3 = new QuestionList("Đơn vị thiên văn?", "là bán kính của hệ Mặt Trời", "là khoảng cách từ Trái Đất đến Mặt Trời", "là quãng đường ánh sáng đi được trong 1 năm", "bằng 1,5.10^8 m", "là khoảng cách từ Trái Đất đến Mặt Trời", "");
        final QuestionList question4 = new QuestionList("Việc các hành tinh quay xung quanh Mặt Trời theo cùng một chiều được giải thích là hệ quả của định luật?", "bảo toàn năng lượng", "bảo toàn khối lượng", "bảo toàn momen động lượng", "bảo toàn động lượng", "bảo toàn momen động lượng", "");
        final QuestionList question5 = new QuestionList("Các hành tinh trong hệ Mặt Trời không có tính chất chung nào nêu dưới đây?", "Đều có các quỹ đạo không giao nhau", "Đều có các vệ tinh quay xung quanh", "Đều quay quanh Mặt Trời theo cùng một chiều", "Đều không tự phát sáng", "Đều có các vệ tinh quay xung quanh", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> thienvanQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Người ta dùng kính thiên văn để quan sát những?", "vật rất nhỏ ở rất xa", "vật nhỏ ở ngang trước vật kính", "thiên thể ở xa", "ngôi nhà cao tầng", "thiên thể ở xa", "");
        final QuestionList question2 = new QuestionList("Một kính thiên văn gồm vật kính có tiêu cự 100cm và thị kính có tiêu cự 4cm. Số bội giác của kính khi người mắt tốt quan sát Mặt Trăng trong trạng thái không điều tiết là?", "20", "24", "25", "30", "25", "");
        final QuestionList question3 = new QuestionList("Một kính thiên văn học sinh gồm vật kính có tiêu cự 1,2m, thị kính. Khi ngắm chừng ở vô cực, số bội giác của kính là 30. Khoảng cách giữa vật kính và thị kính là?", "120cm", "4cm", "124cm", "5,2m", "124cm", "");
        final QuestionList question4 = new QuestionList("Vật kính của kính thiên văn khúc xạ có đặc điểm?", "có tiêu cự nhỏ", "là thấu kính phân kì", "là thấu kính hội tụ có tiêu cự nhỏ", "là thấu kính hội tụ có tiêu cự lớn", "là thấu kính hội tụ có tiêu cự lớn", "");
        final QuestionList question5 = new QuestionList("Bộ phận có cấu tạo giống nhau ở kính thiên văn và kính hiển vi là?", "Vật kính", "Thị kính", "Vật kính của kính hiển vi và thị kính của kính thiên văn", "Không có", "Thị kính", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> thienvanQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Người ta dùng kính thiên văn để quan sát những?", "vật rất nhỏ ở rất xa", "vật nhỏ ở ngang trước vật kính", "thiên thể ở xa", "ngôi nhà cao tầng", "thiên thể ở xa", "");
        final QuestionList question2 = new QuestionList("Một kính thiên văn gồm vật kính có tiêu cự 100cm và thị kính có tiêu cự 4cm. Số bội giác của kính khi người mắt tốt quan sát Mặt Trăng trong trạng thái không điều tiết là?", "20", "24", "25", "30", "25", "");
        final QuestionList question3 = new QuestionList("Một kính thiên văn học sinh gồm vật kính có tiêu cự 1,2m, thị kính. Khi ngắm chừng ở vô cực, số bội giác của kính là 30. Khoảng cách giữa vật kính và thị kính là?", "120cm", "4cm", "124cm", "5,2m", "124cm", "");
        final QuestionList question4 = new QuestionList("Vật kính của kính thiên văn khúc xạ có đặc điểm?", "có tiêu cự nhỏ", "là thấu kính phân kì", "là thấu kính hội tụ có tiêu cự nhỏ", "là thấu kính hội tụ có tiêu cự lớn", "là thấu kính hội tụ có tiêu cự lớn", "");
        final QuestionList question5 = new QuestionList("Bộ phận có cấu tạo giống nhau ở kính thiên văn và kính hiển vi là?", "Vật kính", "Thị kính", "Vật kính của kính hiển vi và thị kính của kính thiên văn", "Không có", "Thị kính", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> thienvanQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Người ta dùng kính thiên văn để quan sát những?", "vật rất nhỏ ở rất xa", "vật nhỏ ở ngang trước vật kính", "thiên thể ở xa", "ngôi nhà cao tầng", "thiên thể ở xa", "");
        final QuestionList question2 = new QuestionList("Một kính thiên văn gồm vật kính có tiêu cự 100cm và thị kính có tiêu cự 4cm. Số bội giác của kính khi người mắt tốt quan sát Mặt Trăng trong trạng thái không điều tiết là?", "20", "24", "25", "30", "25", "");
        final QuestionList question3 = new QuestionList("Một kính thiên văn học sinh gồm vật kính có tiêu cự 1,2m, thị kính. Khi ngắm chừng ở vô cực, số bội giác của kính là 30. Khoảng cách giữa vật kính và thị kính là?", "120cm", "4cm", "124cm", "5,2m", "124cm", "");
        final QuestionList question4 = new QuestionList("Vật kính của kính thiên văn khúc xạ có đặc điểm?", "có tiêu cự nhỏ", "là thấu kính phân kì", "là thấu kính hội tụ có tiêu cự nhỏ", "là thấu kính hội tụ có tiêu cự lớn", "là thấu kính hội tụ có tiêu cự lớn", "");
        final QuestionList question5 = new QuestionList("Bộ phận có cấu tạo giống nhau ở kính thiên văn và kính hiển vi là?", "Vật kính", "Thị kính", "Vật kính của kính hiển vi và thị kính của kính thiên văn", "Không có", "Thị kính", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> dongvatQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Sự đa dạng của động vật được thể hiện rõ nhất ở?", "Cấu tạo cơ thể và số lượng loài", "Số lượng loài và môi trường sống", "Môi trường sống và hình thức dinh dưỡng", "Hình thức dinh dưỡng và hình thức vận chuyển", "Số lượng loài và môi trường sống", "");
        final QuestionList question2 = new QuestionList("Đặc điểm cơ bản nhất để phân biệt nhóm động vật có xương sống với nhóm động vật không xương sống là?", "Hình thái đa dạng", "Có xương sống", "Kích thước cơ thể lớn", "Sống lâu", "Có xương sống", "");
        final QuestionList question3 = new QuestionList("Tập hợp các loài nào sau đây thuộc lớp Động vật có vú (Thú)?", "Tôm, muỗi, lợn, cừu", "Bò, châu chấu, sư tử, voi", "Cá voi, vịt trời, rùa, thỏ", "Gấu, mèo, dê, cá heo", "Gấu, mèo, dê, cá heo", "");
        final QuestionList question4 = new QuestionList("Nhóm động vật nào sau đây có số lượng loài lớn nhất?", "Nhóm cá", "Nhóm giun", "Nhóm chân khớp", "Nhóm ruột khoang", "Nhóm chân khớp", "");
        final QuestionList question5 = new QuestionList("Cá heo là đại diện của nhóm động vật nào sau đây?", "Cá", "Cồn cát", "Thú", "Bò xát", "Thú", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> dongvatQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Sự đa dạng của động vật được thể hiện rõ nhất ở?", "Cấu tạo cơ thể và số lượng loài", "Số lượng loài và môi trường sống", "Môi trường sống và hình thức dinh dưỡng", "Hình thức dinh dưỡng và hình thức vận chuyển", "Số lượng loài và môi trường sống", "");
        final QuestionList question2 = new QuestionList("Đặc điểm cơ bản nhất để phân biệt nhóm động vật có xương sống với nhóm động vật không xương sống là?", "Hình thái đa dạng", "Có xương sống", "Kích thước cơ thể lớn", "Sống lâu", "Có xương sống", "");
        final QuestionList question3 = new QuestionList("Tập hợp các loài nào sau đây thuộc lớp Động vật có vú (Thú)?", "Tôm, muỗi, lợn, cừu", "Bò, châu chấu, sư tử, voi", "Cá voi, vịt trời, rùa, thỏ", "Gấu, mèo, dê, cá heo", "Gấu, mèo, dê, cá heo", "");
        final QuestionList question4 = new QuestionList("Nhóm động vật nào sau đây có số lượng loài lớn nhất?", "Nhóm cá", "Nhóm giun", "Nhóm chân khớp", "Nhóm ruột khoang", "Nhóm chân khớp", "");
        final QuestionList question5 = new QuestionList("Cá heo là đại diện của nhóm động vật nào sau đây?", "Cá", "Cồn cát", "Thú", "Bò xát", "Thú", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> dongvatQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Sự đa dạng của động vật được thể hiện rõ nhất ở?", "Cấu tạo cơ thể và số lượng loài", "Số lượng loài và môi trường sống", "Môi trường sống và hình thức dinh dưỡng", "Hình thức dinh dưỡng và hình thức vận chuyển", "Số lượng loài và môi trường sống", "");
        final QuestionList question2 = new QuestionList("Đặc điểm cơ bản nhất để phân biệt nhóm động vật có xương sống với nhóm động vật không xương sống là?", "Hình thái đa dạng", "Có xương sống", "Kích thước cơ thể lớn", "Sống lâu", "Có xương sống", "");
        final QuestionList question3 = new QuestionList("Tập hợp các loài nào sau đây thuộc lớp Động vật có vú (Thú)?", "Tôm, muỗi, lợn, cừu", "Bò, châu chấu, sư tử, voi", "Cá voi, vịt trời, rùa, thỏ", "Gấu, mèo, dê, cá heo", "Gấu, mèo, dê, cá heo", "");
        final QuestionList question4 = new QuestionList("Nhóm động vật nào sau đây có số lượng loài lớn nhất?", "Nhóm cá", "Nhóm giun", "Nhóm chân khớp", "Nhóm ruột khoang", "Nhóm chân khớp", "");
        final QuestionList question5 = new QuestionList("Cá heo là đại diện của nhóm động vật nào sau đây?", "Cá", "Cồn cát", "Thú", "Bò xát", "Thú", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> sinhhocQuestions() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Hãy chọn câu sau đây có thứ tự sắp xếp các cấp độ tổ chức sống từ thấp đến cao?","Cơ thể, quần thể, hệ sinh thái, quần xã", "Quần xã, quần thể, hệ sinh thái, cơ thể", "Quần thể, quần xã, cơ thể, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "");
        final QuestionList question2 = new QuestionList("Trong các cấp tổ chức sống dưới đây, cấp nào là lớn nhất?", "Tế bào", "Quần xã", "Quần thể", "Bào quan", "Quần xã", "");
        final QuestionList question3 = new QuestionList("Tổ chức sống nào sau đây có cấp thấp nhất so với các tổ chức còn lại?", "Quần thể", "Quần xã", "Cơ thể", "Hệ sinh thái", "Cơ thể", "");
        final QuestionList question4 = new QuestionList("Đàn voi sống trong rừng thuộc cấp độ tổ chức sống nào dưới đây?", "Cá thể", "Quần xã", "Quần thể", "Hệ sinh thái", "Quần thể", "");
        final QuestionList question5 = new QuestionList("Tập hợp nhiều tế bào cùng loại và cùng thực hiện một chức năng nhất định tạo thành:", "Hệ cơ quan", "Mô", "Cơ thể", "Cơ quan", "Mô", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> sinhhocQuestionsEasy() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Hãy chọn câu sau đây có thứ tự sắp xếp các cấp độ tổ chức sống từ thấp đến cao?","Cơ thể, quần thể, hệ sinh thái, quần xã", "Quần xã, quần thể, hệ sinh thái, cơ thể", "Quần thể, quần xã, cơ thể, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "");
        final QuestionList question2 = new QuestionList("Trong các cấp tổ chức sống dưới đây, cấp nào là lớn nhất?", "Tế bào", "Quần xã", "Quần thể", "Bào quan", "Quần xã", "");
        final QuestionList question3 = new QuestionList("Tổ chức sống nào sau đây có cấp thấp nhất so với các tổ chức còn lại?", "Quần thể", "Quần xã", "Cơ thể", "Hệ sinh thái", "Cơ thể", "");
        final QuestionList question4 = new QuestionList("Đàn voi sống trong rừng thuộc cấp độ tổ chức sống nào dưới đây?", "Cá thể", "Quần xã", "Quần thể", "Hệ sinh thái", "Quần thể", "");
        final QuestionList question5 = new QuestionList("Tập hợp nhiều tế bào cùng loại và cùng thực hiện một chức năng nhất định tạo thành:", "Hệ cơ quan", "Mô", "Cơ thể", "Cơ quan", "Mô", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    private static List<QuestionList> sinhhocQuestionsHard() {

        final List<QuestionList> questionsLists = new ArrayList<>();

        //
        final QuestionList question1 =  new QuestionList("Hãy chọn câu sau đây có thứ tự sắp xếp các cấp độ tổ chức sống từ thấp đến cao?","Cơ thể, quần thể, hệ sinh thái, quần xã", "Quần xã, quần thể, hệ sinh thái, cơ thể", "Quần thể, quần xã, cơ thể, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "Cơ thể, quần thể, quần xã, hệ sinh thái", "");
        final QuestionList question2 = new QuestionList("Trong các cấp tổ chức sống dưới đây, cấp nào là lớn nhất?", "Tế bào", "Quần xã", "Quần thể", "Bào quan", "Quần xã", "");
        final QuestionList question3 = new QuestionList("Tổ chức sống nào sau đây có cấp thấp nhất so với các tổ chức còn lại?", "Quần thể", "Quần xã", "Cơ thể", "Hệ sinh thái", "Cơ thể", "");
        final QuestionList question4 = new QuestionList("Đàn voi sống trong rừng thuộc cấp độ tổ chức sống nào dưới đây?", "Cá thể", "Quần xã", "Quần thể", "Hệ sinh thái", "Quần thể", "");
        final QuestionList question5 = new QuestionList("Tập hợp nhiều tế bào cùng loại và cùng thực hiện một chức năng nhất định tạo thành:", "Hệ cơ quan", "Mô", "Cơ thể", "Cơ quan", "Mô", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return  questionsLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopicName, int getSelectedDifficulty) {
        switch (selectedTopicName) {
            case "Địa Lý":
                if(getSelectedDifficulty == 1){
                    return dialyQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  dialyQuestionsHard();
                }
                else{
                    return dialyQuestions();
                }
            case "Hoá Học":
                if(getSelectedDifficulty == 1){
                    return hoahocQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  hoahocQuestions();
                }
                else{
                    return hoahocQuestionsHard();
                }
            case "Vũ Trụ":
                if(getSelectedDifficulty == 1){
                    return vutruQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  vutruQuestions();
                }
                else{
                    return vutruQuestionsHard();
                }
            case "Động Vật":
                if(getSelectedDifficulty == 1){
                    return dongvatQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  dongvatQuestions();
                }
                else{
                    return dongvatQuestionsHard();
                }
            case "Thiên Văn":
                if(getSelectedDifficulty == 1){
                    return thienvanQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  thienvanQuestions();
                }
                else{
                    return thienvanQuestionsHard();
                }
            default:
                if(getSelectedDifficulty == 1){
                    return sinhhocQuestionsEasy();
                }
                else if(getSelectedDifficulty == 2){
                    return  sinhhocQuestions();
                }
                else{
                    return sinhhocQuestionsHard();
                }
        }
    }
}
