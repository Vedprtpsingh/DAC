#include <iostream>
#define TotalPlayer 2
using namespace std;

class Players {
private:
    int score;
    string name;
public:
    Players() {}
    Players(string n, int s) {
        name = n;
        score = s;
    }
    int getScore() {
        return score;
    }
    string getName() {
        return name;
    }
};

int main() {
    Players p[TotalPlayer];
    int total = 0, highest = 0;
    string playerName;

    for (int i = 0; i < TotalPlayer; i++) {
        cout << "Enter Player " << i + 1 << " Name: ";
        string na;
        cin >> na;
        cout << "Enter Player " << i + 1 << " Score: ";
        int s;
        cin >> s;

        p[i] = Players(na, s);
        total += p[i].getScore();

        if (highest < p[i].getScore()) {
            highest = p[i].getScore();
            playerName = p[i].getName();
        }
    }

    double average = (double)total / TotalPlayer;

    cout << "Total Team Score: " << total << endl;
    cout << "Team Average Score: " << average << endl;
    cout << "Highest Score: " << highest << " by Player: " << playerName << endl;

    return 0;
}
