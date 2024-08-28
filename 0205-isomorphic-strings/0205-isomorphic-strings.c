bool isIsomorphic(char* s, char* t) {
    if (strlen(s) != strlen(t)) {
        return false;
    }

    int arr1[256] = { 0 }, arr2[256] = { 0 };

    for (int i = 0; i < strlen(s); i++) {
        if (arr1[(int)s[i]] != arr2[(int)t[i]]) {
            return false;
        }

        arr1[(int)s[i]] = i + 1;
        arr2[(int)t[i]] = i + 1;
    }
    return true;
}