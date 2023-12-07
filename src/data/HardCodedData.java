public static class HardCodedData {
    public List<Livro> getLivros(){
        List<Livro> livros = new List<Livro>();
        livros.add(new Livro("100","Engenharia de Software","Addison Wesley","Ian Sommervile", "6ª", "2000"));
        livros.add(new Livro("101","UML - Guia do Usuário","Campus Grady Booch, James Rumbaugh, Ivar Jacobson","7ª", "2000"));
        livros.add(new Livro("200","Code Complete","Microsoft Press","Steve McConnell 2ª 2014"));
        livros.add(new Livro("201","Agile Software Development, Principles, Patterns, and Practices","Prentice Hall","Robert Martin", "1ª", " 2002"));
        livros.add(new Livro("300","Refactoring: Improving the Design of Existing Code","Addison Wesley Professional","Martin Fowler ", "1ª", " 1999"));
        livros.add(new Livro("301","Software Metrics: A Rigorous and Practical Approach","CRC Press Norman Fenton, James Bieman", "3ª", " 2014"));
        livros.add(new Livro("400","Design Patterns: Elements of Reusable Object-Oriented Software","Addison Wesley Professional, Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides","1ª", " 1994"));
        livros.add(new Livro("401","UML Distilled: A Brief Guide to the Standard Object Modeling Language","Addison Wesley Professional","Martin Fowler ", "3ª", " 2003"));
        return livros; 
    }
    public List<Exemplar> getExemplares(){
        List<Exemplar> exemplares = new List<Exemplar>();

        exemplares.add(new Exemplar(100, 01, true));
        exemplares.add(new Exemplar(100, 02, true));
        exemplares.add(new Exemplar(101, 03, true));
        exemplares.add(new Exemplar(200, 04, true));
        exemplares.add(new Exemplar(201, 05, true));
        exemplares.add(new Exemplar(300, 06, true));
        exemplares.add(new Exemplar(300, 07, true));
        exemplares.add(new Exemplar(400, 08, true));
        exemplares.add(new Exemplar(400, 09, true));
        return  exemplares;
    }

    public List<Aluno> getAlunos() {
        List<Exemplar> alunos = new List<Exemplar>();

        alunos.add(new AlunoGraduacao(123, true));
        alunos.add(new AlunoPosGraduacao(456, true));
        alunos.add(new AlunoGraduacao(789, true));
        alunos.add(new Professor(100, true));
        return alunos; 
    }
}