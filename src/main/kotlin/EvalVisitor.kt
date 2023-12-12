import Node.Expression.BinaryExpression
import Node.Expression.Constant
import Node.Expression.UnaryExpression
import Node.Conditional
import Node.Expression

class EvalVisitor : Visitor<LiteralValue> {
    override fun visitConstant(constantExpr: Constant): LiteralValue {
        TODO("Not yet implemented")
    }

    override fun visitUnaryExpr(unaryExpression: UnaryExpression): LiteralValue {
        TODO("Not yet implemented")
    }

    override fun visitBinaryExpr(binaryExpression: BinaryExpression): LiteralValue {
        TODO("Not yet implemented")
    }

    override fun visitConditional(conditional: Conditional): LiteralValue {
        TODO("Not yet implemented")
    }

    override fun visit(node: Node): LiteralValue {
        TODO("Not yet implemented")
    }


}
