#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int i =0;
    char szoveg[1000];
    char be;

    FILE *fp;
    fp = fopen("rend.txt", "r");

    if(fp != NULL)
    {
        while( fgets(szoveg, sizeof(szoveg), fp) != NULL )
        {
            if( szoveg[strlen(szoveg) - 1 ] == '\n' )
            {
                szoveg[strlen(szoveg) - 1 ] == '\0';
            }
        }
    }
    else
    {
        printf("File hiba!");
    }

    fclose(fp);

    printf("%s", szoveg);

    return 0;
}