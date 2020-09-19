/**
 * git init
 * 
 * git status
 * 
 * git add .
 * 
 * git commit -m "first commit"
 * 
 * git log --oneline
 * 
 * 
 * To check out the index.html from the second commit, find the number of
 *  the second commit using the git log, and then type the following at the prompt:
 * 
 * git checkout <second commit's number> index.html
 * 
 * To discard the effect of the previous operation 
 * and restore index.html to its state at the end of the third commit, type:
 * 
 * git reset HEAD index.html
 * 
 * Then type the following at the prompt:
 * 
 * git checkout -- index.html
 * 
 * You can also use git reset to reset the staging area to the last commit without disturbing the working directory.
 */