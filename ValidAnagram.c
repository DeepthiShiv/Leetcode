bool isAnagram(char* s, char* t) {
    int count[256]={0};
    if(strlen(s)!=strlen(t)){
        return false;
    }
    for(int i=0;s[i]!='\0';i++){
        count[(int)s[i]]++;
    }
    for(int i=0;t[i]!='\0';i++){
        count[(int)t[i]]--;
    }
    for(int i=0;i<256;i++){
        if(count[i]!=0){
            return false;
        }
    }
    return true;
}
