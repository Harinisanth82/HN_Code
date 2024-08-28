bool checkIfPangram(char* sentence) {
    int lgt,i,flag;
    int low[26]={0};
    sentence[strcspn(sentence,"\n")]='\0';
    lgt=strlen(sentence);
    for(i=0;i<lgt;i++){
        if(isalpha(sentence[i])){
            low[tolower(sentence[i])-'a']=1;
        }
    }
    for(i=0;i<26;i++){
        if(low[i]!=1){
            return 0;
        }
    }
    return 1;  
}