bool digitCount(char* num) {
    int res[10]={0};
    int lgt=strlen(num);
    for(int i=0;i<lgt;i++){
        int dmy=num[i]-'0';
        res[dmy]++;
    }
    for(int i=0;i<lgt;i++){
        int sample=num[i]-'0';
        if(sample!=res[i]){
            return false;
        }
    }
    return true;
}