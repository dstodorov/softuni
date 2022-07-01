package SoftUni.advancedMay.advanced.definingClasses.exercises.google;

import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemonList;
    private List<Parent> parents;
    private List<Child> children;

    public Person(String name, Company company, Car car, List<Pokemon> pokemonList, List<Parent> parents, List<Child> children) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.pokemonList = pokemonList;
        this.parents = parents;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    private String getPokemonForPrint() {
        StringBuilder sb = new StringBuilder();
        pokemonList.forEach(pokemon -> sb.append(pokemon.getPokemonName()).append(" ").append(pokemon.getPokemonType()).append("\n"));
        if (pokemonList.size() == 0) sb.append("\n");
        return sb.toString();
    }

    private String getParentsForPrint() {
        StringBuilder sb = new StringBuilder();
        parents.forEach(parent -> sb.append(parent.getName()).append(" ").append(parent.getBirthday()).append("\n"));
        if (parents.size() == 0) sb.append("\n");
        return sb.toString();
    }

    private String getChildrenForPrint() {
        StringBuilder sb = new StringBuilder();
        children.forEach(child -> sb.append(child.getName()).append(" ").append(child.getBirthday()).append("\n"));
        if (children.size() == 0) sb.append("\n");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append("Company:").append("\n");
        if (this.company.getName() != null) {
            sb.append(this.getCompany().getName()).append(" ").append(this.company.getDepartment()).append(" ").append(String.format("%.2f", this.company.getSalary())).append("\n");
        }
        sb.append("Car:").append("\n");
        if (this.car.getModel() != null) {
            sb.append(this.getCar().getModel()).append(" ").append(this.car.getSpeed()).append("\n");
        }
        sb.append("Pokemon:" + "\n");
        if (pokemonList.size() > 0) sb.append(getPokemonForPrint());
        sb.append("Parents:" + "\n");
        if (parents.size() > 0) sb.append(getParentsForPrint());
        sb.append("Children:" + "\n");
        if (children.size() > 0) sb.append(getChildrenForPrint());
        return sb.toString();
    }

}
