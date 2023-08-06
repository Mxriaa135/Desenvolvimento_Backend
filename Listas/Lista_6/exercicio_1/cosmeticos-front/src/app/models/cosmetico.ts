export class Cosmetico{
    public id!: number;
    public nome!: string;
    public preco!: number;
    public imagem!: string;

    constructor(id:number, nome:string, preco:number, imagem: string){
        this.id = id
        this.nome = nome
        this.preco = preco
        this.imagem = imagem
    }
}