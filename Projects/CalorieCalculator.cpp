//<code_start>
    #include <bits/stdc++.h>
    using namespace std;

    double calories;
    bool again;

    double getWeight(){
        cout << "Enter your weight in kg.\n";
        double w;
        cin >> w;
        return w;
    }
    double getHeight(){
        cout << "Enter your height in cm.\n";
        double h;
        cin >> h;
        return h;
    }

    double getAge(){
        cout << "Enter your age.\n";
        double a;
        cin >> a;
        return a;
    }

    string getGender(){
        cout << "Enter your gender.\n";
        string gender;
        cin >> gender;
        return gender;
    }

    int getActivityLevel(){
        cout << "Enter your activity level:\n1 -> sedentary\n2 -> lightly active\n3 -> moderately active\n4 -> very active\n";
        int activity;
        cin >> activity;
        return activity;
    }

    double calculateBMR(double height, double weight, double age, string gender){

        double BMR;
        transform(gender.begin(), gender.end(), gender.begin(), ::tolower); //lowercase
        if(gender == "male"){
            BMR = 66.47 + (13.57 * weight) + (5.003 * height) - (6.755 * age);
        }
        else{
            BMR = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
        }

        return BMR;
    }

    double calculateCalories(double BMR, int activityLevel){
        double calories;

        if(activityLevel == 1){
            calories = BMR * 1.2;
        }

        if(activityLevel == 2){
            calories = BMR * 1.375;
        }

        if(activityLevel == 3){
            calories = BMR * 1.55;
        }

        if(activityLevel == 4){
            calories = BMR * 1.725;
        }

        return calories;
    }

    void displayResults(){
        cout << "Calories needed: " << calories << endl;
    }

    void exitPrograms(){
        cout << "Want to calculate again or exit the program?(y -> calculate again n -> exit)\n";
        char c;
        cin >> c;
        if(c == 'n'){
            again = false;
        }
        else if(c == 'y'){
            return;
        }
        else exitPrograms();
    }

    int main()
    {
        again = true;
        while(again){
            double height, weight, age;
            string gender;
            int activityLevel;
            
            height = getHeight();
            weight = getWeight();
            age = getAge();
            gender = getGender();
            activityLevel = getActivityLevel();

            double BMR = calculateBMR(height, weight, age, gender);

            calories = calculateCalories(BMR, activityLevel);

            displayResults();

            exitPrograms();
        }
    }
//<code_end>
